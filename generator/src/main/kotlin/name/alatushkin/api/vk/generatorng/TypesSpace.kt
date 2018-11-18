package name.alatushkin.api.vk.generatorng

import name.alatushkin.api.vk.generatorng.source.*

class TypesSpace {
    private val typeReferences = HashMap<JsonTypeRef, TypeId>()
    val definedTypes = HashMap<TypeId, TypeDefinition>()
    private val typeAliases = HashMap<TypeId, TypeId>()
    val interfaceImplementations = HashSet<Pair<TypeId, TypeId>>()

    val typesDefined: Int get() = definedTypes.size

    fun splitToInterfaceImplemnetationPairIfNeed(typeId: TypeId): TypeId {
        val actualAtype = resolveActualTypeId(typeId)
        val type = definedTypes[actualAtype]



        assert(type is ObjectType) { "only ObjectType can be splited" }
        if ((type as ObjectType).kind == ObjectType.Kind.INTERFACE) {
            println("$typeId Already splited")
            return typeId
        }

        val implType = type.copy(
            props = type.props.map { it.copy(inherited = true) },
            parents = setOf(typeId),
            kind = ObjectType.Kind.CLASS
        )
        val interfaceType = type.copy(
            kind = ObjectType.Kind.INTERFACE
        )

        val implTypeId = typeId.copy(typeName = typeId.typeName + "Impl")
        registerTypeImplementation(implTypeId, implType)
        replaceTypeImplementation(typeId, interfaceType)

        interfaceImplementations.add(typeId to implTypeId)

        return typeId
    }

    fun renameType(oldTypeId: TypeId, newTypeId: TypeId): TypeId {
        if (oldTypeId == newTypeId)
            return oldTypeId

        println("Rename $oldTypeId to $newTypeId")
        println("$oldTypeId")
        println("$newTypeId")

        typeAliases[oldTypeId] = newTypeId
        val old = definedTypes.remove(oldTypeId)!!
        println(old)
        println()

        registerTypeImplementation(newTypeId, old)
        return newTypeId
    }

    fun registerPremitiveType(jsonRef: JsonTypeRef, className: String) {
        registerType(jsonRef, PrimitiveType.typeId(className), PrimitiveType)
    }

    fun registerType(jsonRef: JsonTypeRef, typeId: TypeId, type: TypeDefinition): TypeId {
        registerTypeReference(jsonRef, typeId)
        registerTypeImplementation(typeId, type)
        return typeId
    }

    fun registerTypeReference(jsonRef: JsonTypeRef, typeId: TypeId) {
        if (typeReferences.containsKey(jsonRef) && typeReferences[jsonRef] != typeId) {
            error("Try to redefine jsonREference: $jsonRef from ${typeReferences[jsonRef]} to $typeId")
        }
        typeReferences[jsonRef] = typeId
    }

    fun registerTypeImplementation(typeId: TypeId, type: TypeDefinition): TypeId {
        val oldObject = definedTypes[typeId]
        if (definedTypes.containsKey(typeId) && oldObject != type) {
            println("Collision with name $typeId")
            println("New:")
            println(type)
            println("Old:")
            println(oldObject)
        }
        return replaceTypeImplementation(typeId, type)
//        definedTypes[typeId] =
//                if (oldObject is ObjectType && type is ObjectType && (setOf(type.kind, oldObject.kind).contains(
//                        ObjectType.Kind.INTERFACE
//                    ))
//                )
//                    type.copy(kind = ObjectType.Kind.INTERFACE, parents = (oldObject.parents + type.parents).toSet())
//                else
//                    type
//
//        return typeId
    }

    fun replaceTypeImplementation(typeId: TypeId, type: TypeDefinition): TypeId {

        definedTypes[typeId] =
                type


        return typeId
    }

    fun printDefinedTypesNames() {
        definedTypes.map { it.key.typeName to it.key.packages.joinToString(".") }.sortedBy { it.first }
            .forEach(::println)
    }

    fun findType(filterPredicate: (TypeDefinition) -> Boolean): List<Pair<TypeId, TypeDefinition>> {
        return definedTypes.filter {
            filterPredicate(it.value)
        }.toList()
    }

    fun resolveTypeIdByJsonRef(jsonRef: JsonTypeRef): TypeId {
        val typeId = typeReferences[jsonRef] ?: error("Unknown type for jsonREference $jsonRef")
        return resolveActualTypeId(typeId)
    }

    fun resolveActualTypeId(typeId: TypeId): TypeId {
        val preResult = (typeAliases[typeId]?.let(this::resolveActualTypeId) ?: typeId)

        val result = preResult.copy(paramTypeIds = preResult.paramTypeIds.map { resolveActualTypeId(it) })

        assert(definedTypes[result] != null) { "final typeId in typeAlias is absent in defined types $preResult" }
        return result
    }

    fun registerPredefined(fullName: String) {
        val parts = fullName.split(".")
        registerTypeImplementation(TypeId(parts.dropLast(1), parts.last()), PrimitiveType)
    }

    fun resolveTypeIdByJsonRefOrNull(ref: JsonTypeRef): TypeId? {
        val typeId = typeReferences[ref] ?: return null
        return resolveActualTypeId(typeId)
    }

    fun newTypeOf(suffix: String, rootTypeId: TypeId, extraTypeId: TypeId): TypeId {
        splitToInterfaceImplemnetationPairIfNeed(rootTypeId)

        val rootType = definedTypes[rootTypeId]!! as ObjectType
        val extraType = definedTypes[extraTypeId]!! as ObjectType
        val newTypeId = rootTypeId.copy(typeName = rootTypeId.typeName + suffix)
        val newType =
            rootType.copy(
                kind = ObjectType.Kind.CLASS,
                props = listOf(rootType, extraType)
                    .flatMap { it.props.map { prop -> prop.copy(inherited = true) } },
                parents = rootType.parents + rootTypeId
            )

        registerTypeImplementation(newTypeId, newType)

        return newTypeId
    }

    fun addParentToType(typeId: TypeId, parentTypeId: TypeId) {
        val type = definedTypes[typeId]!! as ObjectType
        val parentType = definedTypes[parentTypeId]!! as ObjectType

        splitToInterfaceImplemnetationPairIfNeed(parentTypeId)

        replaceTypeImplementation(
            typeId,
            type.copy(
                parents = type.parents + parentTypeId,
                props = (normalizeTypeIds(type.props).toSet() + normalizeTypeIds(parentType.props).map {
                    it.copy(
                        inherited = true
                    )
                }.toSet()).toList()
            )
        )
    }

    private fun normalizeTypeIds(list: List<ObjectType.Prop>): List<ObjectType.Prop> {
        return list.map { it.copy(typeId = resolveActualTypeId(it.typeId)) }
    }
}