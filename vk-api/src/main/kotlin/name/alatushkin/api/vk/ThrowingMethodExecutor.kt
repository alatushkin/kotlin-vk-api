package name.alatushkin.api.vk

import name.alatushkin.api.vk.api.VkApiException
import name.alatushkin.api.vk.api.VkFail
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.Token
import name.alatushkin.httpclient.HttpClient

data class ThrowingMethodExecutor(val base: MethodExecutor) {
    suspend operator fun <T> invoke(method: VkMethod<T>, token: Token<*>): T {
        val result = base(method, token)
        when (result) {
            is VkSuccess -> return result.response
            is VkFail -> throw VkApiException(result.error)
        }
    }

    val httpClient: HttpClient get() = base.httpClient
}

fun MethodExecutor.throwing(): ThrowingMethodExecutor =
        ThrowingMethodExecutor(this)
