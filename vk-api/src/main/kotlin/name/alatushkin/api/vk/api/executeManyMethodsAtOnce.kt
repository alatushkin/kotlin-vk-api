package name.alatushkin.api.vk.api

import com.fasterxml.jackson.databind.JavaType
import name.alatushkin.api.vk.VK_OBJECT_MAPPER
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.methods.ExecuteMethod
import name.alatushkin.api.vk.constructType
import name.alatushkin.api.vk.tokens.MethodRequirement
import name.alatushkin.api.vk.tokens.VkClient

suspend inline operator fun <reified T, M> VkClient<M>.invoke(methods: List<M>): Array<T>
        where M : VkMethod<T>, M : MethodRequirement =
    executeUnchecked(makeVkScriptToCall(methods, constructType<T>()))

suspend inline fun <reified T, M : VkMethod<T>> VkClient<*>.executeUnchecked(methods: List<M>): Array<T> =
    executeUnchecked(makeVkScriptToCall(methods, constructType<T>()))

fun <T, M : VkMethod<T>> makeVkScriptToCall(methods: List<M>, singleType: JavaType): ExecuteMethod<T> {

    require(methods.size <= ExecuteMethod.MAX_CALLS) { "Attempted to make ${methods.size} batch calls" }

    val mapper = VK_OBJECT_MAPPER
    val typeFactory = mapper.typeFactory

    val code = methods.joinToString(", ", prefix = "return [", postfix = "];") { method ->
        val argsJson = mapper.writeValueAsString(method.toJsonObject())
        "API." + method.apiMethodName + "($argsJson)"
    }

    val arrayType = typeFactory.constructArrayType(singleType)
    return ExecuteMethod(code, arrayType)
}
