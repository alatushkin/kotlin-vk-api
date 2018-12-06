package name.alatushkin.api.vk

import name.alatushkin.api.vk.api.VkFail
import name.alatushkin.api.vk.api.VkMultiError
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.api.VkSingleError
import name.alatushkin.httpclient.HttpClient
import name.alatushkin.httpclient.HttpMethod
import name.alatushkin.httpclient.RequestBody
import name.alatushkin.httpclient.Response

data class SimpleMethodExecutor(override val httpClient: HttpClient) : MethodExecutor {

    override suspend operator fun <T> invoke(method: VkMethod<T>): VkResponse<T> {
        val params = method.toJsonObject()
        val httpRequest = HttpMethod.POST(
            url = methodUrl(method),
            body = RequestBody.FormUrlEncoded(params)
        )
        val response = httpClient(httpRequest)
        return deserializeResponse(response, method)
    }

    private fun <T> deserializeResponse(
        response: Response,
        method: VkMethod<T>
    ): VkResponse<T> {
        val node = VK_OBJECT_MAPPER.readTree(response.data)
        return when {
            node.has("error") ->
                VkFail(node["error"].traverse(VK_OBJECT_MAPPER).readValueAs(VkSingleError::class.java))
            node.has("execute_errors") ->
                VkFail(node["execute_errors"].traverse(VK_OBJECT_MAPPER).readValueAs(VkMultiError::class.java))
            else ->
                VK_OBJECT_MAPPER.readValue(node.traverse(VK_OBJECT_MAPPER), method.responseType)
        }
    }

    private fun methodUrl(method: VkMethod<*>) = URL_PREFIX + method.apiMethodName

    companion object {
        const val URL_PREFIX = "https://api.vk.com/method/"
    }
}
