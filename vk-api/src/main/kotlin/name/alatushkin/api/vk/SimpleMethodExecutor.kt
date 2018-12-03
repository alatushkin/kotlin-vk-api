package name.alatushkin.api.vk

import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.httpclient.HttpClient
import name.alatushkin.httpclient.HttpMethod
import name.alatushkin.httpclient.RequestBody

data class SimpleMethodExecutor(override val httpClient: HttpClient) : MethodExecutor {

    override suspend operator fun <T> invoke(method: VkMethod<T>): VkResponse<T> {
        val params = method.toJsonObject()
        val httpRequest = HttpMethod.POST(
                url = methodUrl(method),
                body = RequestBody.FormUrlEncoded(params)
        )
        val response = httpClient(httpRequest)
        return VK_OBJECT_MAPPER.readValue(response.data, method.responseType)
    }

    private fun methodUrl(method: VkMethod<*>) = URL_PREFIX + method.apiMethodName

    companion object {
        const val URL_PREFIX = "https://api.vk.com/method/"
    }
}
