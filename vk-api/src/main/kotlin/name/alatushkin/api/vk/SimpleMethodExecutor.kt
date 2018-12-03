package name.alatushkin.api.vk

import name.alatushkin.api.vk.api.VkError
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.messages.Keyboard
import name.alatushkin.httpclient.HttpClient
import name.alatushkin.httpclient.HttpMethod
import name.alatushkin.httpclient.RequestBody

data class SimpleMethodExecutor(override val httpClient: HttpClient) : MethodExecutor {

    @Throws(VkError::class)
    override suspend operator fun <T> invoke(method: VkMethod<T>): T {
        val params = method.props
                .filterValuesNotNull()
                .mapKeys { caseConvert(restorePropNames(it.key)) }
                .mapValues { toStringRequestValue(it.value) }
                .plus(method.presetProps + mapOf("v" to VERSION))

        val httpRequest = HttpMethod.POST(url = methodUrl(method), body = RequestBody.FormUrlEncoded(params))
        val response = httpClient(httpRequest)
        val vkResponse: VkResponse<T> = VK_OBJECT_MAPPER.readValue(response.data, method.classRef)
        return vkResponse.value()
    }
}

private const val URL_PREFIX = "https://api.vk.com/method/"
private const val VERSION = "5.87"

private fun <K, V> Map<K, V?>.filterValuesNotNull(): Map<K, V> =
        mapNotNull { (key, value) -> value?.let { key to value } }.toMap()

private fun toStringRequestValue(it: Any): String = when (it) {
    is Array<*> -> it.joinToString(",")
    is Keyboard -> VK_OBJECT_MAPPER.writeValueAsString(it)
    else -> it.toString()
}

private fun restorePropNames(key: String): String = when (key) {
    "cls" -> "class"
    "obj" -> "object"
    else -> key
}

private fun methodUrl(method: VkMethod<*>) = URL_PREFIX + method.apiMethodName

private fun caseConvert(s: String) = camelCaseToLowerUnderscore(s)

private fun camelCaseToLowerUnderscore(s: String): String =
        s.replace(Regex("(.)(\\p{Upper})"), "$1_$2").toLowerCase()