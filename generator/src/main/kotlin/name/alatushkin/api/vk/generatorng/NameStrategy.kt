package name.alatushkin.api.vk.generatorng

import name.alatushkin.api.vk.generatorng.source.JsonTypeRef
import name.alatushkin.api.vk.generatorng.source.TypeId
import name.alatushkin.api.vk.generatorng.source.alterClassName

typealias NameStrategy = (str: String) -> TypeId

fun nameMethod(jsonTypeRef: JsonTypeRef): TypeId {
    //notes.edit -> notes.methods.NotesEdit
    val parts = jsonTypeRef.split(".")
    val className = parts.map { it.capitalize() }.joinToString("") + "Method"
    val packages = listOf(parts.first(), "methods")
    return TypeId(packages, className)
}

fun nameResponse(jsonTypeRef: JsonTypeRef): TypeId {
    //account_getCounters_response -> account.responses.GetCounterResponse
    val parts = jsonTypeRef.split("_")
    val className = parts.drop(1).joinToString("") { it.capitalize() } + "Response"
    val packages = listOf(parts.first(), "responses")
    return TypeId(packages, className)
}

fun nameObject(jsonTypeRef: JsonTypeRef): TypeId {
    //photos_photo_xtr_real_offset -> photos.PhotoXtrRealOffset
    val parts = jsonTypeRef.split("_")
    val className = parts.drop(1).joinToString("") { it.capitalize() }
    val packageNameSpace = parts.first()
    val packages = listOf(if (packageNameSpace == "base") "common" else packageNameSpace)
    return TypeId(packages, alterClassName(className))
}