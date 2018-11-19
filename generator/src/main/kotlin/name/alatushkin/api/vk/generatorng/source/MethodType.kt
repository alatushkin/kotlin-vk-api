package name.alatushkin.api.vk.generatorng.source

import name.alatushkin.api.vk.generatorng.source.writer.SourceWriter

data class MethodArgument(
    val typeId: TypeId,
    val name: String,
    val description: String? = null
)

data class MethodType(
    val methodUrl: String,
    val arguments: List<MethodArgument>,
    val result: TypeId,
    val defailtParams: Map<String, String?> = emptyMap(),
    override val description: String? = null
) : TypeDefinition {


    class Item(val name: String, val value: String)

    override fun generateSource(basePackage: String, typeId: TypeId, sourceWriter: SourceWriter): String {
        with(sourceWriter) {
            val hasParams = arguments.isNotEmpty()
            val fieldsDefinition = arguments.joinToString("\n", prefix = "\n", postfix = "\n") { arg ->
                sourceWriter.constructorField(
                    name = arg.name,
                    type = arg.typeId,
                    inherited = false,
                    final = false,
                    delegateBy = "props",
                    defaultValue = ""
                )
            }

            val constructorArgs = arguments.joinToString(",\n        ", prefix = "\n        ", postfix = "\n") { arg ->
                sourceWriter.argument(
                    name = arg.name,
                    type = arg.typeId
                )
            }

            val classRef = renderClassRef(basePackage, typeId, sourceWriter)

            val parentClass = sourceWriter.parentType(result)
            val importClause = sourceWriter.importClause(basePackage, typeId)

            val builder = StringBuilder()
                .append(importClause)

            builder.append(description())

            builder.append("class ${typeId.typeName}")
            if (hasParams)
                builder.append("()")

            builder.append(
                " : $parentClass(\n    \"$methodUrl\",\n" +
                        "    ${toMapSource(defailtParams)}\n)"
            )

            builder.append(" {\n")
            if (hasParams) {
                builder.append(fieldsDefinition)
                builder.append("\n")
                builder.append("    constructor(")
                builder.append(constructorArgs)
                builder.append("    ) : this() {\n")
                builder.append(
                    arguments.map { fieldNameEscaped(it.name) }.map { "        this.$it = $it" }.joinToString(
                        "\n"
                    )
                )
                builder.append("\n    }\n\n")
                builder.append(
                    arguments
                        .map {
                            "\n    fun set${fieldName(it.name).capitalize()}(${fieldNameEscaped(it.name)}: ${realType(it.typeId).fullTypeName}): ${typeId.typeName} {\n" +
                                    "        this.${fieldNameEscaped(it.name)} = ${fieldNameEscaped(it.name)}\n" +
                                    "        return this\n" +
                                    "    }"
                        }.joinToString(
                            "\n"
                        ).substring(1)
                )

                builder.append("\n\n")
            }
            builder.append(classRef)

            builder.append("\n}\n")

            return builder.toString()
        }
    }

    private fun renderClassRef(
        basePackage: String,
        typeId: TypeId,
        sourceWriter: SourceWriter
    ): String {
        sourceWriter.importType(TypeId("/com.fasterxml.jackson.core.type", "TypeReference"))
        sourceWriter.importType(TypeId("/name.alatushkin.api.vk.api", "VkResponse"))
        return """    override val classRef = ${typeId.typeName}.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<${result.paramTypeIds.first().fullTypeName}>>() {}
    }"""
    }

    private fun toMapSource(map: Map<String, String?>): String {
        return if (map.isEmpty())
            "HashMap()"
        else
            map.filterValues { it != null }.map {
                "\"${it.key}\" to \"${it.value}\""
            }.joinToString(", ", prefix = "mutableMapOf(", postfix = ")")
    }

    fun description(): String {
        return """/**
 *  ${this.description}
 *
 *  [https://vk.com/dev/${this.methodUrl}]
""" +
                this.arguments.map {
                    " *  @property [${it.name}]${(it.description?.trim()?.let { " $it" }) ?: ""}"
                }.joinToString("\n") + "\n */\n"
    }
}

