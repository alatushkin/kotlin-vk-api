package name.alatushkin.api.vk

import name.alatushkin.api.vk.api.VkError
import name.alatushkin.httpclient.HttpClient

data class VkClient(val executor: MethodExecutor, val accessToken: String) {

    @Throws(VkError::class)
    suspend operator fun <T> invoke(method: VkMethod<T>): T {
        method.presetProps["access_token"] = accessToken
        return executor(method)
    }

    val httpClient: HttpClient
        get() = executor.httpClient
}

fun MethodExecutor.withToken(accessToken: String): VkClient =
        VkClient(this, accessToken)