package name.alatushkin.api.vk.generatorng

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.module.kotlin.readValue
import name.alatushkin.api.vk.generatorng.json.*
import name.alatushkin.api.vk.generatorng.source.*
import name.alatushkin.api.vk.generatorng.source.writer.KotlinSourceWriter
import name.alatushkin.api.vk.readSchemaTextFromFile
import name.alatushkin.api.vk.readTextFromFile
import java.io.File
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths


class SourceGenerator {
    lateinit var methodsSchema: MethodsSchema
    lateinit var objectsSchema: ObjectsSchema
    lateinit var responsesSchema: ResponcesSchema

    val jsonObjects = HashMap<JsonTypeRef, Object>()

    private val typesSpace = TypesSpace()

    fun methodsSchemaFrom(fileName: String) {
        val jsonString = readSchemaTextFromFile(fileName)
        methodsSchema = OBJECT_MAPPER.readValue(jsonString)

    }

    fun loadObjectsDefinitionsFrom(fileName: String) {
        val jsonString = readSchemaTextFromFile(fileName)
        objectsSchema = OBJECT_MAPPER.readValue(jsonString)
        objectsSchema.definitions.forEach { ref, obj ->
            jsonObjects[ref] = obj
        }
    }

    fun loadResponsesDefinitionsFrom(fileName: String) {
        val jsonString = readSchemaTextFromFile(fileName)
        responsesSchema = OBJECT_MAPPER.readValue(jsonString)
        responsesSchema.definitions.forEach { ref, obj ->
            jsonObjects[ref] = obj.properties.response!!
        }

    }

    fun resolveTypes() {
        defineCommonTypes()
        resolveMethods()
        println("Defined ${typesSpace.typesDefined} types")
        typesSpace.printDefinedTypesNames()
    }

    /**
     * пройти по всем методам
     * каждый из них расщипить если нужно, согласно логике
     * Для каждого из получившихся "простых" методов:
     *  Определить "тип" (объект,список,VkСписок)
     *  Сформировать Type для возвращаемого значени
     *  Объявить Type для метода
     */
    private fun resolveMethods() {
        println("Total methods: ${methodsSchema.methods.size}")
        val normalizedMethods = methodsSchema.methods.mapNotNull { normalizeMethodDefinition(it) }.flatten()
            .filter { responseSchemaIsDefined(it.responses.response) }
        println("Normalized  methods: ${normalizedMethods.size}")
        normalizedMethods.forEach(this::makeMethod)
    }

    private fun responseSchemaIsDefined(ref: SchemaFileRef): Boolean {
        val result = responsesSchema.definitions.containsKey(ref.toJsonRef())
        if (!result)
            println("WARN: no response type defined $ref")
        return result
    }

    private fun normalizeMethodDefinition(methodSchema: MethodSchema): List<MethodSchema>? {
        val response = methodSchema.responses
        return response.normalizeMethodDefinition(methodSchema)
    }

    /**
     *  Сформировать Type для возвращаемого значени
     *  Объявить Type для метода
     */
    private fun makeMethod(methodsSchema: MethodSchema) {
        val methodResultType = makeMethodResultType(methodsSchema)
        if (methodResultType == null)
            println("[WARN]: cant define method ${methodsSchema.name} cause of problems with result")
        else {
            val methodType = MethodType(
                methodUrl = methodsSchema.name,
                arguments = methodsSchema.parameters.map {
                    MethodArgument(
                            typeId = resolveMethodParamToTypeId(methodsSchema.name, it),
                            name = it.name,
                            required = it.required ?: false,
                            description = it.description
                    )
                }.map { it.name to it }.toMap().values.toList(),
                result = methodResultType,
                defaultParams = methodsSchema.fixedParams,
                methodAccessType = makeMethodAccessType(methodsSchema),
                description = methodsSchema.description
            )
            val typeId = nameMethod(methodsSchema.name).copy(typeName = methodsSchema.className)
            typesSpace.registerTypeImplementation(typeId, methodType)
        }
    }

    private fun makeMethodResultType(methodSchema: MethodSchema): TypeId? {
        val responseRef = methodSchema.responses.response.toJsonRef()
        val responseObject = responsesSchema.definitions[responseRef]!!.properties.response!!

        return when {
            responseObject is GeneralObject &&
                    responseObject.properties.containsKey("items") &&
                    responseObject.properties.containsKey("count") && responseObject.properties.size == 2 -> makeVkListVkResult(
                makeType(::nameResponse, responseRef, responseObject.properties["items"]!!)
            )
            responseObject is ArrayObject -> makeListVkResult(
                makeType(
                    ::nameResponse,
                    responseRef,
                    responseObject.items
                )
            )
            else -> makeObjectVkResult(makeType(::nameResponse, responseRef, responseObject))
        }
    }

    private fun makeObjectVkResult(typeId: TypeId?): TypeId? {
        return typeId?.let { TypeId("name.alatushkin.api.vk", "VkMethod", listOf(it)) }
    }

    private fun makeListVkResult(typeId: TypeId?): TypeId? {
        return typeId?.let {
            TypeId(
                "name.alatushkin.api.vk",
                "VkMethod",
                listOf(PrimitiveType.typeId("Array").copy(paramTypeIds = listOf(it)))
            )
        }
    }

    private fun makeVkListVkResult(typeId: TypeId?): TypeId? {
        return typeId?.let {
            TypeId(
                "name.alatushkin.api.vk",
                "VkMethod",
                listOf(TypeId("name.alatushkin.api.vk.api", "VkList", it.paramTypeIds))
            )
        }
    }

    private fun makeVkIteratorVkResult(typeId: TypeId?): TypeId? {
        return typeId?.let {
            TypeId(
                "name.alatushkin.api.vk",
                "VkMethod",
                listOf(TypeId("name.alatushkin.api.vk.api", "VkIterator", it.paramTypeIds))
            )
        }
    }

    private fun makeMethodAccessType(methodSchema: MethodSchema): MethodAccessType? {
        val interfacePackage = "/name.alatushkin.api.vk.tokens"

        val tokenTypes = methodSchema.accessTokenType.toSet()
        val filteredTokenTypes = listOf("user", "group", "service").filter { tokenTypes.contains(it) }
        if (filteredTokenTypes.isEmpty()) return null

        val interfaceName = filteredTokenTypes.joinToString("", postfix = "Method") { it.capitalize() }

        return MethodAccessType(interfaceName, interfacePackage)
    }


    private fun makeType(nameStategy: NameStrategy, responseRef: JsonTypeRef, typeObject: Object?): TypeId? {
        if (typeObject == null) {
            println("Type $responseRef is undefined")
            return null
        }
        val alreadyDefined = typesSpace.resolveTypeIdByJsonRefOrNull(responseRef)

        if (alreadyDefined != null) {
            println("$responseRef already defined to $alreadyDefined")
            return alreadyDefined
        }


        return when (typeObject) {
            is SimpleObject -> typesSpace.resolveTypeIdByJsonRef(typeObject.type)
            is OneOfObject -> makeOneOfType(::nameObject, responseRef, typeObject)
            is AllOfObject -> makeAllOfType(::nameObject, responseRef, typeObject)
            is RefObject -> {
                val toJsonRef = typeObject.toJsonRef()
                val objDefinition = objectsSchema.definitions[toJsonRef]
                makeType(::nameObject, toJsonRef, objDefinition)
            }
            is SimpleObjectMultiType -> typesSpace.resolveTypeIdByJsonRef("string")
            is EnumObject -> makeEnumType(nameStategy, responseRef, typeObject)
            is ArrayObject -> makeType(::nameObject, responseRef, typeObject.items)?.let {
                PrimitiveType.typeId("Array").copy(paramTypeIds = listOf(it))
            }
            is GeneralObject -> makeTypeFromGeneralObject(nameStategy, responseRef, typeObject)
            is ObjectWithPatternProperties -> makeMapResultType()
        }
    }

    private fun makeEnumType(
            nameStategy: NameStrategy,
            responseRef: JsonTypeRef,
            typeObject: EnumObject
    ): TypeId {
        val typeIdByRef =
            typesSpace.resolveTypeIdByJsonRefOrNull(responseRef)?.let { typesSpace.resolveActualTypeId(it) }
        if (typeIdByRef != null)
            return typeIdByRef

        val typeId = nameStategy(responseRef)
        if (typesSpace.definedTypes[typeId]?.fixedName == true)
            return typeId

        val type = EnumType.decodeTypeDefinition(typeObject.enum, typeObject.enumNames)

        return if (type == PrimitiveType)
            PrimitiveType.typeId("Boolean")
        else
            typesSpace.registerTypeImplementation(typeId, type)
    }

    private fun makeOneOfType(nameStategy: NameStrategy, responseRef: JsonTypeRef, typeObject: OneOfObject): TypeId? {
        //для каждго ref - делаем сплит и родительскому интерфйесу добавляем в родители пустой маркер-интерфейс этого объекта
        assert(typeObject.oneOf.all { it is RefObject }) { "can only translate oneOff made of references" }
        val rootTypeId = nameStategy(responseRef)
        val rootType = ObjectType(props = emptyList(), kind = ObjectType.Kind.INTERFACE)
        typesSpace.registerTypeReference(responseRef, rootTypeId)
        typesSpace.registerTypeImplementation(rootTypeId, rootType)

        typeObject.oneOf.forEach { item ->
            when (item) {
                is RefObject -> {
                    val refType = makeType(::nameObject, item.toJsonRef(), item)!!
                    typesSpace.addParentToType(refType, rootTypeId)
                }

                is GeneralObject -> {
                    val refType =
                        makeType(::nameObject, responseRef + "_" + item.properties.entries.first().key, item)!!
                    typesSpace.addParentToType(refType, rootTypeId)
                }
                else -> println("[Warn]:Cant process ${item.javaClass.simpleName}")
            }
        }
        return rootTypeId
    }

    private fun makeAllOfType(
            nameStategy: NameStrategy,
            responseRef: JsonTypeRef,
            typeObject: AllOfObject
    ): TypeId? {
        //OneOf - игнорируем
        //для каждго ref - делаем сплит и добавляем свойства из него
        //для properties - просто получаем список свойств
        val ownProps = typeObject.allOf.filterIsInstance(GeneralObject::class.java)
            .flatMap { objectPropsToClassProps(it.properties, nameStategy, responseRef, it.required) }.toSet().toList()

        val rootType = ObjectType(ownProps)

        val rootTypeId = nameStategy(responseRef)
        typesSpace.registerTypeReference(responseRef, rootTypeId)
        typesSpace.registerTypeImplementation(rootTypeId, rootType)

        typeObject.allOf.filterIsInstance(RefObject::class.java)
            .map {
                val refObject = objectsSchema.definitions[it.toJsonRef()]
                makeType(::nameObject, it.toJsonRef(), refObject)
                    ?: error("Cant make ref type for ${it.toJsonRef()}")
            }.toSet().forEach { parentTypeId ->
                typesSpace.addParentToType(rootTypeId, parentTypeId)
            }


        val anyOf = typeObject.allOf.firstOrNull { it is OneOfObject } as? OneOfObject
        if (anyOf != null) {
            typesSpace.splitToInterfaceImplemnetationPairIfNeed(rootTypeId)

            anyOf.oneOf.forEach { item ->
                when (item) {
                    is RefObject -> {
                        val refType = makeType(::nameObject, item.toJsonRef(), item)!!
                        typesSpace.addParentToType(refType, rootTypeId)
                    }

                    is GeneralObject -> {
                        val refType =
                            makeType(::nameObject, responseRef + "_" + item.properties.entries.first().key, item)!!
                        typesSpace.addParentToType(refType, rootTypeId)
                    }
                    else -> println("[Warn]:Cant process ${item.javaClass.simpleName}")
                }


            }
        }

        return rootTypeId
    }

    private fun makeTypeFromGeneralObject(
            nameStategy: NameStrategy,
            responseRef: JsonTypeRef,
            typeObject: GeneralObject
    ): TypeId? {
        val result = typesSpace.resolveTypeIdByJsonRefOrNull(responseRef)
        if (result != null)
            return result

        val typeId = nameObject(responseRef)
        typesSpace.registerTypeReference(responseRef, typeId)

        val props =
            objectPropsToClassProps(typeObject.properties, nameStategy, responseRef, typeObject.required).map { prop ->
                prop.copy(nullable = !typeObject.required.contains(prop.name))
            }


        return typesSpace.registerTypeImplementation(typeId, ObjectType(props))

    }

    private fun objectPropsToClassProps(
            properties: Map<String, Object>,
            nameStrategy: NameStrategy,
            responseRef: JsonTypeRef,
            required: Array<String> = emptyArray()
    ): List<ObjectType.Prop> {
        return properties.mapNotNull { (name, propObj) ->
            val typeId = makeType(nameStrategy, responseRef + "_" + name, propObj)
            if (typeId == null) {
                println("[WARN]:cant resolve $responseRef > $name")
                return@mapNotNull null
            }

            val finalType = if (name == "date" && typeId.typeName == "Long")
                TypeId("name.alatushkin.api.vk.api", "VkDate")
            else if (name == "bdate" && typeId.typeName == "String")
                TypeId("name.alatushkin.api.vk.api", "VkBirthDate")
            else
                typeId

            ObjectType.Prop(name, finalType, propObj.inherited, nullable = !required.contains(name))
        }.map {
            it.copy(typeId = typesSpace.resolveActualTypeId(it.typeId))
        }
    }


    private fun makeMapResultType(): TypeId {
        val typeId = TypeId(
                "kotlin.collection",
                "Map",
                listOf(PrimitiveType.typeId("Long"), PrimitiveType.typeId("Boolean"))
        )

        return typesSpace.registerTypeImplementation(typeId, PrimitiveType)
    }


    private fun resolveMethodParamToTypeId(methodName: String, param: MethodParameter): TypeId {
        val needToDeclareEnum = param.enum != null

        return when {
            needToDeclareEnum -> declareEnumFromParam(methodName, param)
            param.type == "array" -> ArrayType(typesSpace.resolveTypeIdByJsonRef(param.items!!.type)).makeTypeId
            else -> typesSpace.resolveTypeIdByJsonRef(param.type)
        }
    }

    private fun declareEnumFromParam(methodName: String, param: MethodParameter): TypeId {
        val parts = methodName.split(".")
        val nameCandidate = param.name
        val candidateTypeId = nameObject((parts + nameCandidate).joinToString("_"))
        val enumValues = param.enum!!
        val enumNames = param.enumNames
        return defineEnumType(enumValues, enumNames, nameCandidate, candidateTypeId)
    }

    private fun defineEnumType(
        enumValues: Array<String>,
        enumNames: Array<String>?,
        simpleName: String,
        expectedTypeId: TypeId
    ): TypeId {
        val type = EnumType.decodeTypeDefinition(enumValues, enumNames)
        val oldDefinedType = typesSpace.findType { it == type }.firstOrNull()
        if (oldDefinedType != null && simpleName !in setOf("type", "sex")) {
            if (oldDefinedType.second.fixedName) {
                //это прдопределенный тип никуда его не двигаем
                return oldDefinedType.first
            } else {
                //если они оба в одном неймспейсе - не перевозим их в common
                val newPackages = if (oldDefinedType.first.packages.containsAll(expectedTypeId.packages))
                    oldDefinedType.first.packages
                else
                    listOf("common")

                val newTypeName = if (simpleName.contains("xtr")) {
                    oldDefinedType.first
                } else {
                    nameObject("base_$simpleName")
                }

                return typesSpace.renameType(oldDefinedType.first, newTypeName.copy(packages = newPackages))
            }
        } else {
            typesSpace.registerTypeImplementation(expectedTypeId, type)
            return expectedTypeId
        }
    }


    private fun defineCommonTypes() {
        typesSpace.registerPremitiveType("base_boolean_int", "Boolean")
        typesSpace.registerPremitiveType("base_bool_int", "Boolean")
        typesSpace.registerPremitiveType("ok_response", "Boolean")
        typesSpace.registerPremitiveType("base_property_exists", "Boolean")
        typesSpace.registerPremitiveType("base_ok_response", "Boolean")
        typesSpace.registerPremitiveType("integer", "Long")
        typesSpace.registerPremitiveType("string", "String")
        typesSpace.registerPremitiveType("boolean", "Boolean")
        typesSpace.registerPremitiveType("number", "Double")
        typesSpace.registerPredefined("name.alatushkin.api.vk.api.VkDate")
        typesSpace.registerPredefined("name.alatushkin.api.vk.VkMethod")
        typesSpace.registerPredefined("name.alatushkin.api.vk.api.VkList")
        typesSpace.registerPredefined("name.alatushkin.api.vk.api.VkIterator")
        typesSpace.registerPredefined("kotlin.collection.List")

        typesSpace.registerType(
            "base_mode",
            TypeId(listOf("common"), "Mode"),
            EnumType.define(
                mapOf("0" to "disabled", "1" to "open", "2" to "limited")
            )
        )
        typesSpace.registerTypeImplementation(
            TypeId(listOf("common"), "AccessLevel"),
            EnumType.define(
                mapOf("0" to "managers", "1" to "members", "2" to "all")
            )
        )
        val costTypeId = typesSpace.registerType(
            "ads_ad_layout_cost_type",
            TypeId(listOf("ads"), "CostType"),
            EnumType.define(
                mapOf("0" to "per clicks", "1" to "per impressions")
            )
        )
        typesSpace.registerTypeReference("ads_ad_cost_type", costTypeId)
    }

    private fun deleteOldAndRecreate(absPath: Path?) {
        Files.createDirectories(absPath)
        Files.walk(absPath)
            .map<File>(Path::toFile)
            .sorted { o1, o2 -> -o1.compareTo(o2) }
            .forEach { it.delete() }

        Files.createDirectories(absPath)
    }

    fun resolveType(refId: JsonTypeRef) {
        defineCommonTypes()

        makeType(::nameObject, refId, objectsSchema.definitions[refId]!!)

        println("Defined ${typesSpace.typesDefined} types")
    }

    fun resolveMethod(methodId: String) {
        defineCommonTypes()
        val normalizedMethods =
            methodsSchema.methods.filter { it.name == methodId }.mapNotNull { normalizeMethodDefinition(it) }.flatten()
                .filter { responseSchemaIsDefined(it.responses.response) }
        println("Normalized  methods: ${normalizedMethods.size}")
        normalizedMethods.forEach(this::makeMethod)
    }

    private fun concatenatePackage(packagePath: String, fileName: String): String {
        return if (packagePath.last() == '/') "$packagePath$fileName" else "$packagePath/$fileName"
    }

    fun loadPatchesFrom(vararg patchFileNames: String, patchPackage: String) {
        patchFileNames.forEach { fileName ->
            val jsonString = readTextFromFile(concatenatePackage(patchPackage, fileName))
            val patch: Patch = OBJECT_MAPPER.readValue(jsonString)
            methodsSchema.methods.removeIf { patch.methods.any { p -> p.name == it.name } }
            methodsSchema.methods += patch.methods

            responsesSchema.definitions.putAll(patch.responses)
            objectsSchema.definitions.putAll(patch.objects)
        }
    }

    fun loadPatchesFromPackage(patchPackage: String) {
        val packageWithSlash = concatenatePackage(patchPackage, "")
        val packageResource = Thread.currentThread().contextClassLoader.getResourceAsStream(packageWithSlash)
                ?: String::class.java.getResourceAsStream(packageWithSlash) ?: error("Package $patchPackage not found")
        val fileNames = packageResource.use { it.reader().buffered().readLines() }
        loadPatchesFrom(*fileNames.toTypedArray(), patchPackage = patchPackage)
    }

    fun writeSourceTo(path: Path, basePackage: String) {
        val sourceWriter = KotlinSourceWriter(typesSpace)
        val absPath = Paths.get(path.toAbsolutePath().normalize().toString(), *basePackage.split(".").toTypedArray())
        deleteOldAndRecreate(absPath)

        typesSpace.definedTypes.forEach { (typeId, type) ->
            if (type.hasSource) {
                val source = type.generateSource(basePackage, typeId, sourceWriter.copy())
                val filePath: Path =
                    Paths.get(absPath.toString(), *(typeId.packages.toTypedArray() + (typeId.typeName + ".kt")))
                Files.createDirectories(filePath.parent)
                Files.write(filePath, source.split('\n'))
            }
        }
    }

    fun writeTypeResolver(path: Path, basePackage: String) {
        val absPath = Paths.get(path.toAbsolutePath().normalize().toString(), *basePackage.split(".").toTypedArray())

        val filePath: Path =
            Paths.get(absPath.toString(), "initTypeResolver.kt")

        Files.createDirectories(filePath.parent)
        val source = generateTypeMapping(basePackage, typesSpace)
        Files.write(filePath, source.toByteArray())
    }

    private fun generateTypeMapping(basePackage: String, typesSpace: TypesSpace): String {
        val importBuffer = StringBuffer("import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver\n")
        val bodyBuffer = StringBuffer()

        typesSpace.interfaceImplementations
            .map { (iFace, Impl) ->
                typesSpace.resolveActualTypeId(iFace) to typesSpace.resolveActualTypeId(Impl)
            }
            .forEach { (iFace, Impl) ->
                importBuffer.append("import $basePackage." + iFace.fullPackageName).append("\n")
                importBuffer.append("import $basePackage." + Impl.fullPackageName).append("\n")

                bodyBuffer.append("    resolver.addMapping(${iFace.typeName}::class.java, ${Impl.typeName}::class.java)\n")
            }

        return "package $basePackage\n" + importBuffer.toString() + "\n\n" + "fun initTypeResolver(): SimpleAbstractTypeResolver {\n" +
                "    val resolver = SimpleAbstractTypeResolver()\n" +
                bodyBuffer.toString() +
                "return resolver\n}"

    }

}

private val OBJECT_MAPPER = ObjectMapper().registerModule(KotlinModule())
