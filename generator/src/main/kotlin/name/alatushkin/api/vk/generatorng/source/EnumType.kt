package name.alatushkin.api.vk.generatorng.source

import name.alatushkin.api.vk.generatorng.json.EnumObject
import name.alatushkin.api.vk.generatorng.nameObject
import name.alatushkin.api.vk.generatorng.source.writer.SourceWriter
import java.util.*

data class EnumType(
    val items: Array<Item>,
    override val fixedName: Boolean = false
) : TypeDefinition {

    data class Item(val name: String, val value: String)

    companion object {
        fun define(values: Map<String, String>): TypeDefinition {
            val sortedValues = values.entries.sortedBy { it.key }
            return decodeTypeDefinitionInternal(
                sortedValues.map { it.key }.toTypedArray(),
                sortedValues.map { it.value }.toTypedArray(),
                true
            )
        }

        fun decodeTypeDefinition(typeRefId: JsonTypeRef, jsonObject: EnumObject): Pair<TypeId, TypeDefinition> {
            val typeId = nameObject(typeRefId)
            return typeId to decodeTypeDefinition(jsonObject.enum, jsonObject.enumNames)
        }

        fun decodeTypeDefinition(
            values: Array<String>,
            names: Array<String>?,
            fixedName: Boolean = false
        ): TypeDefinition {
            if (isSameAsBoolean(values))
                return PrimitiveType

            return decodeTypeDefinitionInternal(values, names, fixedName)
        }

        private fun decodeTypeDefinitionInternal(
            values: Array<String>,
            names: Array<String>?,
            fixedName: Boolean = false
        ): TypeDefinition {
            val items = ((names ?: values))
                .zip(values)
                .map { (name, value) -> EnumType.Item(name, value) }

            return EnumType(items.toTypedArray(), fixedName)
        }

        private fun isSameAsBoolean(values: Array<String>): Boolean {
            return values.size == 1 && values.toSet().contains("1") ||
                    (values.size == 2 &&
                            values.toSet().containsAll(listOf("0", "1")))
        }
    }

    override fun toString(): String {
        return "EnumType items=${Arrays.toString(items)})"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EnumType) return false

        if (!items.contentEquals(other.items)) return false

        return true
    }

    override fun hashCode(): Int {
        return items.contentHashCode()
    }

    override fun generateSource(basePackage: String, typeId: TypeId, sourceWriter: SourceWriter): String {

        val packageClause = sourceWriter.packageClause(basePackage, typeId)

        val result = StringBuilder()

        result.append("""
            |$packageClause
            |
            |import com.fasterxml.jackson.annotation.JsonCreator
            |import com.fasterxml.jackson.annotation.JsonValue
            |
            |enum class ${typeId.typeName}(@JsonValue val jsonValue: String) {
        """.trimMargin())

        result.append(items.joinToString(",\n    ", prefix = "\n    ", postfix = ";\n\n") { item ->
            sourceWriter.enumItem(
                    item.name,
                    item.value
            )
        })

        result.append("""
            |    override fun toString() = jsonValue
            |
            |    companion object {
            |        @JvmStatic
            |        @JsonCreator
            |        fun fromJsonValue(value: String): ${typeId.typeName} =
            |            ${typeId.typeName}.values().find { it.jsonValue == value }!!
            |    }
            |}
            |
        """.trimMargin())
        return result.toString()
    }
}
