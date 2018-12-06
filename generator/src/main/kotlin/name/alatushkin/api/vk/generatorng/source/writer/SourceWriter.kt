package name.alatushkin.api.vk.generatorng.source.writer

import name.alatushkin.api.vk.generatorng.TypesSpace
import name.alatushkin.api.vk.generatorng.source.TypeId
import name.alatushkin.api.vk.under2camel

interface SourceWriter {
    fun constructorField(
        name: String,
        type: TypeId,
        inherited: Boolean = false,
        final: Boolean = true,
        nullable: Boolean,
        defaultValue: String?,
        delegateBy: String?
    ): String

    fun argument(
        name: String,
        type: TypeId,
        nullable: Boolean,
        defaultValue: String?
    ): String

    fun parentType(type: TypeId): String

    fun enumItem(name: String, vararg values: String): String

    fun importClause(basePackage: String, typeId: TypeId): String

    fun copy(): SourceWriter
    fun packageClause(basePackage: String, typeId: TypeId? = null): String
    fun fieldName(name: String): String
    fun fieldNameEscaped(name: String): String
    fun realType(typeId: TypeId): TypeId
    fun importType(type: TypeId)
}


operator fun Boolean.invoke(onTrue: String, onFalse: String = ""): String {
    return if (this)
        onTrue
    else
        onFalse
}

class KotlinSourceWriter(val typesSpace: TypesSpace) : SourceWriter {
    val referencedTypes = HashSet<TypeId>()

    override fun constructorField(
        name: String,
        type: TypeId,
        inherited: Boolean,
        final: Boolean,
        nullable: Boolean,
        defaultValue: String?,
        delegateBy: String?
    ): String {
        return "    " + inherited("override ") + final("val ", "var ") + argument(
            name,
            type,
            nullable,
            defaultValue
        ) + (delegateBy?.let { " by $it" } ?: "")
    }

    override fun argument(name: String, type: TypeId, nullable: Boolean, defaultValue: String?): String {
        val realType = typesSpace.resolveActualTypeId(type)
        importType(realType)
        return "${fieldNameEscaped(name)}: ${realType.fullTypeName}${nullable("?")}" +
                defaultValue?.let { " = $it" }.orEmpty()
    }

    override fun fieldNameEscaped(name: String): String {
        val result = fieldName(name)
        return if (result in setOf("class", "object", "2faRequired")) "`$result`"
        else result
    }

    override fun fieldName(name: String): String {
        return under2camel(name)
    }

    override fun parentType(type: TypeId): String {
        val realType = typesSpace.resolveActualTypeId(type)
        importType(realType)
        return realType.fullTypeName
    }

    override fun importType(type: TypeId) {
        val realType = typesSpace.resolveActualTypeId(type)
        referencedTypes.add(realType)
        realType.paramTypeIds.forEach(this::importType)
    }

    override fun importClause(basePackage: String, typeId: TypeId): String {
        val importsToDo = referencedTypes
            .filterNot { it.packages.first() in setOf("kotlin") }
            .filterNot { it.packages.containsAll(typeId.packages) }

        if (importsToDo.isEmpty()) return ""

        return importsToDo.map { importLine(basePackage, it) }
                .toSortedSet().joinToString("\n", prefix = "\n\n") { "import $it" }
    }

    override fun copy(): SourceWriter {
        return KotlinSourceWriter(typesSpace)
    }

    override fun packageClause(basePackage: String, typeId: TypeId?): String {
        return "package ${(listOf(basePackage) + typeId?.packages.orEmpty()).joinToString(".")}"
    }

    override fun enumItem(name: String, vararg values: String): String {
        val preResultName = name.toUpperCase().replace("[^\\w\\d]+".toRegex(), "_")
        val finalName = if ("0123456789".contains(preResultName[0])) {
            val parts = preResultName.split("_")
            if (parts.size == 2)
                parts[1] + "_" + parts[0]
            else
                "_$preResultName"
        } else
            preResultName

        return finalName + "(" + values.map { "\"$it\"" }.joinToString(", ") + ")"
    }

    private fun importLine(basePackage: String, it: TypeId): String {
        val prefix =
            if (basePackage.startsWith(it.packages.first()) || it.packages.first().startsWith("/"))
                ""
            else
                "$basePackage."

        return prefix + it.packages.joinToString(".").substringAfter("/") + "." + it.typeName
    }

    override fun realType(typeId: TypeId): TypeId {
        return typesSpace.resolveActualTypeId(typeId)
    }
}
