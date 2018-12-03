package name.alatushkin.api.vk

import name.alatushkin.api.vk.api.VkError
import name.alatushkin.httpclient.HttpClient

interface MethodExecutor {
    @Throws(VkError::class)
    suspend operator fun <T> invoke(method: VkMethod<T>): T

    val httpClient: HttpClient
}