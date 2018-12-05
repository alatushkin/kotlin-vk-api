package name.alatushkin.api.vk.tokens

import name.alatushkin.api.vk.MethodExecutor
import name.alatushkin.api.vk.ThrowingMethodExecutor
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.httpclient.HttpClient

data class VkClient<in M: MethodRequirement>(val executor: ThrowingMethodExecutor, val token: Token<M>) {
    val httpClient: HttpClient get() = executor.httpClient

    suspend fun <T> executeUnchecked(method: VkMethod<T>): T =
            executor(method.attach(token))
}

fun <M: MethodRequirement> ThrowingMethodExecutor.withToken(token: Token<M>): VkClient<M> =
        VkClient(this, token)

fun <M: MethodRequirement> MethodExecutor.withToken(token: Token<M>): VkClient<M> =
        VkClient(ThrowingMethodExecutor(this), token)

suspend inline operator fun <T, M> VkClient<M>.invoke(method: M) where M: VkMethod<T>, M: MethodRequirement =
        executeUnchecked(method)
