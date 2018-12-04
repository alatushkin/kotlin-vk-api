package name.alatushkin.api.vk.generatorng.source

import name.alatushkin.api.vk.generatorng.source.writer.SourceWriter
import name.alatushkin.api.vk.generatorng.source.writer.invoke

data class MethodArgument(
    val typeId: TypeId,
    val name: String,
    val required: Boolean,
    val description: String? = null
)

data class MethodAccessType(val interfaceName: String, val interfacePackage: String)

data class MethodType(
        val methodUrl: String,
        val arguments: List<MethodArgument>,
        val result: TypeId,
        val defaultParams: Map<String, String?> = emptyMap(),
        val methodAccessType: MethodAccessType?,
        override val description: String?
) : TypeDefinition {

    class Item(val name: String, val value: String)

    override fun generateSource(
            basePackage: String,
            typeId: TypeId,
            sourceWriter: SourceWriter
    ): String = with(sourceWriter) {

        val hasParams = arguments.isNotEmpty()
        val fieldsDefinition = arguments.joinToString("\n", prefix = "\n", postfix = "\n") { arg ->
            sourceWriter.constructorField(
                    name = arg.name,
                    type = arg.typeId,
                    inherited = false,
                    final = false,
                    nullable = !arg.required,
                    delegateBy = "props",
                    defaultValue = null
            )
        }

        val constructorArgs = arguments.joinToString(",\n        ", prefix = "\n        ") { arg ->
            sourceWriter.argument(
                    name = arg.name,
                    type = arg.typeId,
                    nullable = !arg.required,
                    defaultValue = if (arg.required) null else "null"
            )
        }

        val implementsClause = methodAccessType?.let {
            importType(TypeId(it.interfacePackage, it.interfaceName))
            ", ${it.interfaceName}"
        }.orEmpty()

        val classRef = renderClassRef(sourceWriter)
        val description = renderDescription(sourceWriter)

        val parentClass = parentType(result)

        val packageClause = packageClause(basePackage, typeId)
        val importClause = importClause(basePackage, typeId)

        val builder = StringBuilder()

        builder.append("""
            |@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")
            |
            |$packageClause
            |
            |$importClause$description
            |class ${typeId.typeName}${hasParams("($constructorArgs\n)")} : $parentClass(
            |    "$methodUrl",
            |    ${renderMutableMap(defaultParams)},
            |    $classRef
            |)$implementsClause
        """.trimMargin())

        if (hasParams) {
            val constructorBody = arguments
                    .map { fieldNameEscaped(it.name) }
                    .joinToString("\n") { "        this.$it = $it" }

            builder.append(""" {
                |$fieldsDefinition
                |    init {
                |$constructorBody
                |    }
                |
                |
            """.trimMargin())

            builder.append(arguments.joinToString("\n\n", postfix = "\n}") {
                """
                |    fun set${fieldName(it.name).capitalize()}(${fieldNameEscaped(it.name)}: ${realType(it.typeId).fullTypeName}): ${typeId.typeName} {
                |        this.${fieldNameEscaped(it.name)} = ${fieldNameEscaped(it.name)}
                |        return this
                |    }
                """.trimMargin()
            })
        }

        builder.append("\n")

        return builder.toString()
    }

    private fun renderClassRef(sourceWriter: SourceWriter): String {
        sourceWriter.importType(TypeId("/com.fasterxml.jackson.core.type", "TypeReference"))
        sourceWriter.importType(TypeId("/name.alatushkin.api.vk.api", "VkSuccess"))
        return "object : TypeReference<VkSuccess<${result.paramTypeIds.first().fullTypeName}>>() {}"
    }

    private fun renderMutableMap(map: Map<String, String?>): String {
        return map.filterValues { it != null }.map {
            "\"${it.key}\" to \"${it.value}\""
        }.joinToString(", ", prefix = "mutableMapOf(", postfix = ")")
    }

    private fun renderDescription(sourceWriter: SourceWriter): String = with(sourceWriter) {
        val propertyDescriptions = arguments.joinToString("\n") { arg ->
            " * @property ${fieldName(arg.name)} ${arg.description?.trim().orEmpty()}"
        }

        """
        |/**
        | * [https://vk.com/dev/$methodUrl]
        | *
        | * $description
        | *
        |$propertyDescriptions
        | */
        """.trimMargin()
    }
}
