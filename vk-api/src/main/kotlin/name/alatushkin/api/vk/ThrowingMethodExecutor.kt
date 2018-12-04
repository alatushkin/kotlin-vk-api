package name.alatushkin.api.vk

import name.alatushkin.api.vk.api.VkApiException
import name.alatushkin.api.vk.api.VkFail
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.httpclient.HttpClient

data class ThrowingMethodExecutor(val base: MethodExecutor) {
    suspend operator fun <T> invoke(method: VkMethod<T>): T {
        when (val result = base(method)) {
            is VkSuccess -> return result.response
            is VkFail -> throw VkApiException(result.error)
        }
    }

    val httpClient: HttpClient get() = base.httpClient
}

fun MethodExecutor.throwing(): ThrowingMethodExecutor =
        ThrowingMethodExecutor(this)