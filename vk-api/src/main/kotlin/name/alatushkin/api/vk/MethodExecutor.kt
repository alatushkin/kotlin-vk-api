package name.alatushkin.api.vk

import name.alatushkin.api.vk.api.VkError
import name.alatushkin.httpclient.HttpClient

interface MethodExecutor {
    @Throws(VkError::class)
    suspend operator fun <T> invoke(method: VkMethod<T>): T

    val httpClient: HttpClient
    val accessToken: String
}

data class SimpleMethodExecutor(
        override val httpClient: HttpClient,
        override val accessToken: String
) : MethodExecutor {

    @Throws(VkError::class)
    override suspend operator fun <T> invoke(method: VkMethod<T>): T {
        method.presetProps["access_token"] = accessToken
        return executeApiCall(httpClient, method).value()
    }
}