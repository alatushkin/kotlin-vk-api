package name.alatushkin.api.vk

import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.httpclient.HttpClient
import name.alatushkin.httpclient.HttpMethod
import name.alatushkin.httpclient.RequestBody

class MethodExecutorImpl(
    override val httpClient: HttpClient
) : MethodExecutor {


    override suspend fun <T> invoke(method: VkMethod<T>): VkResponse<T> {
        val params = method.toJsonObject()

        val httpRequest = HttpMethod.POST(
            url = methodUrl(method),
            body = RequestBody.FormUrlEncoded(params)
        )
        val response = httpClient(httpRequest)
        val vkResponse: VkResponse<T> = VK_OBJECT_MAPPER.readValue(response.data, method.classRef)
        return vkResponse
    }

    private fun methodUrl(method: VkMethod<*>) = URL_PREFIX + method.apiMethodName

    companion object {
        const val URL_PREFIX = "https://api.vk.com/method/"
    }
}