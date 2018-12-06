package name.alatushkin.api.vk

import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.Token
import name.alatushkin.httpclient.HttpClient

interface MethodExecutor {
    suspend operator fun <T> invoke(method: VkMethod<T>, token: Token<*>): VkResponse<T>
    val httpClient: HttpClient
}
