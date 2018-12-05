package name.alatushkin.api.vk

import name.alatushkin.api.vk.api.VkApiException
import name.alatushkin.httpclient.HttpClient

data class ThrowingMethodExecutor(val base: MethodExecutor) {
    suspend operator fun <T> invoke(method: VkMethod<T>): T {
        val result = base(method)
        return result.response ?: throw VkApiException(result.error!!)
    }

    val httpClient: HttpClient get() = base.httpClient
}

fun MethodExecutor.throwing(): ThrowingMethodExecutor =
        ThrowingMethodExecutor(this)