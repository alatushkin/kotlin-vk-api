package name.alatushkin.api.vk.api

import com.fasterxml.jackson.databind.JavaType
import name.alatushkin.api.vk.MethodExecutor
import name.alatushkin.api.vk.MethodExecutorWithException
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.methods.ExecuteMethod

suspend inline operator fun <reified T, M : VkMethod<T>> MethodExecutor.invoke(methods: List<M>): VkResponse<Array<T>> {
    val methodToCall = makeVkScriptToCall(methods)
    return this(methodToCall)
}

suspend inline operator fun <reified T, M : VkMethod<T>> MethodExecutorWithException.invoke(methods: List<M>): Array<T> {
    val methodToCall = makeVkScriptToCall(methods)
    return this(methodToCall)
}

inline fun <M : VkMethod<T>, reified T> makeVkScriptToCall(methods: List<M>): ExecuteMethod<Array<T>> {
    assert(methods.size <= 25) { "Maximum 25 call at one allowed by api" }
    val mapper = ExecuteMethod.mapper

    val code = methods.joinToString(", ", prefix = "return [", postfix = "];")
    { method ->
        val argsJson = mapper.writeValueAsString(method.toJsonObject())
        "API." + method.apiMethodName + "($argsJson)"
    }
    val arrayType: JavaType = mapper.typeFactory.constructArrayType(T::class.java)
    return ExecuteMethod(code, arrayType)
}