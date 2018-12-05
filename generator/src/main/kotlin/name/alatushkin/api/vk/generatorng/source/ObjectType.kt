package name.alatushkin.api.vk.generatorng.source

import name.alatushkin.api.vk.generatorng.source.writer.SourceWriter
import name.alatushkin.api.vk.generatorng.source.writer.invoke

data class ObjectType(
        val props: List<Prop>,
        val kind: Kind = Kind.CLASS,
        val parents: Set<TypeId> = emptySet()
) : TypeDefinition {

    enum class Kind {
        CLASS, INTERFACE
    }

    data class Prop(
        val name: String,
        val typeId: TypeId,
        val inherited: Boolean = false,
        val nullable: Boolean = true
    ) {
        override fun toString(): String {
            return "${inherited("override ")}$name:${typeId.fullTypeName}${nullable("?")}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ObjectType) return false

        if (props != other.props) return false

        return true
    }

    override fun hashCode(): Int {
        return props.hashCode()
    }

    override fun toString(): String {
        return "ObjectType(props=$props)"
    }

    override val hasSource: Boolean
        get() = (kind == Kind.CLASS && props.isNotEmpty()) || kind == Kind.INTERFACE

    override fun generateSource(basePackage: String, typeId: TypeId, sourceWriter: SourceWriter): String {
        val defaultValue = if (kind == Kind.INTERFACE) null else "null"

        val delimiter = if (kind == Kind.INTERFACE) "\n" else ",\n"

        val constructorArgs = props.joinToString(delimiter) { arg ->
            sourceWriter.constructorField(
                    name = arg.name,
                    type = arg.typeId,
                    inherited = arg.inherited,
                    nullable = arg.nullable,
                    final = true,
                    defaultValue = defaultValue.takeIf { arg.nullable },
                    delegateBy = null
            )
        }

        val parentTypes = parents.joinToString(",\n    ") { arg ->
            sourceWriter.parentType(arg)
        }

        val packageClause = sourceWriter.packageClause(basePackage, typeId)
        val importClause = sourceWriter.importClause(basePackage, typeId)

        val builder = StringBuilder()
        builder.append(packageClause)
        builder.append("\n\n")
        builder.append(importClause)

        if (kind == Kind.INTERFACE) {
            builder.append("interface")
        } else {
            if (props.isNotEmpty())
                builder.append("open ")
            else
                builder.append("data ")
            builder.append("class")
        }

        builder.append(" ${typeId.typeName}")
        if (kind == Kind.INTERFACE) {
            if (parents.isNotEmpty())
                builder.append(" : ").append(parentTypes)
            builder.append(" {\n")
        } else {
            builder.append("(\n")
        }

        builder.append(constructorArgs)

        if (kind == Kind.INTERFACE) {
            builder.append("\n}")
        } else {
            builder.append("\n)")
            if (parents.isNotEmpty())
                builder.append(" : ").append(parentTypes)
        }

        return builder.toString()
    }
}