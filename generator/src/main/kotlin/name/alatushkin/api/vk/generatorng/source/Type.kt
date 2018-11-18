package name.alatushkin.api.vk.generatorng.source

import name.alatushkin.api.vk.generatorng.source.writer.SourceWriter


typealias JsonTypeRef = String

data class TypeId(val packages: List<String>, val typeName: String, val paramTypeIds: List<TypeId> = emptyList()) {
    constructor(packages: String, typeName: String, paramTypeIds: List<TypeId> = emptyList()) : this(
        packages.split("."),
        typeName,
        paramTypeIds
    )

    val fullTypeName: String
        get() {
            if (paramTypeIds.isEmpty())
                return typeName
            else
                return typeName + "<${paramTypeIds.map { it.fullTypeName }.joinToString(", ")}>"
        }

    val fullPackageName: String
        get() {
            return packages.joinToString(".") + "." + typeName
        }

    override fun toString(): String {
        return "TypeId(${packages.joinToString(".")}.$fullTypeName)"
    }


}

interface TypeDefinition {
    fun generateSource(basePackage: String, typeId: TypeId, sourceWriter: SourceWriter): String = "$typeId"
    val description: String? get() = null
    val fixedName: Boolean get() = false
    val hasSource: Boolean get() = true
}

interface NotRenameableType : TypeDefinition {
    override val fixedName: Boolean
        get() = true
}

object PrimitiveType : NotRenameableType {
    override val hasSource: Boolean
        get() = false

    fun typeId(className: String): TypeId {
        return TypeId(typeName = className, packages = listOf("kotlin"))
    }
}


class ArrayType(val itemType: TypeId) : TypeDefinition {
    val makeTypeId: TypeId = TypeId("kotlin.collection", "Array", listOf(itemType))
}

class TypeAlias(val originalType: TypeId) : TypeDefinition {
    override fun generateSource(basePackage: String, typeId: TypeId, sourceWriter: SourceWriter): String {
        return "tyealias ${typeId.typeName} = ${originalType.typeName}"
    }
}


private val CLASS_NAMES_ALTERATION = mapOf("OnoffOptions" to "OnOffOptions")
fun alterClassName(className: String): String {
    return CLASS_NAMES_ALTERATION[className] ?: className
}
