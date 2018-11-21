package name.alatushkin.api.vk

import name.alatushkin.api.vk.api.VkErrorException
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.messages.Keyboard
import name.alatushkin.httpclient.HttpClient
import name.alatushkin.httpclient.HttpMethod.POST
import name.alatushkin.httpclient.RequestBody.FormUrlEncoded

interface MethodExecutor {
    suspend operator fun <T> invoke(method: VkMethod<T>): VkResponse<T>
    val httpClient: HttpClient
}

interface MethodExecutorWithException {
    @Throws(VkErrorException::class)
    suspend operator fun <T> invoke(method: VkMethod<T>): T

    fun asMethodExecutor(): MethodExecutor
    val httpClient: HttpClient
}

fun MethodExecutor.withToken(accessToken: String): MethodExecutor {
    return object : MethodExecutor {
        override suspend fun <T> invoke(method: VkMethod<T>): VkResponse<T> {
            method.presetProps["access_token"] = accessToken
            return this@withToken(method)
        }

        override val httpClient: HttpClient
            get() = this@withToken.httpClient
    }
}

fun MethodExecutor.throwExceptionsOnError(): MethodExecutorWithException {
    return object : MethodExecutorWithException {
        override fun asMethodExecutor(): MethodExecutor {
            return this@throwExceptionsOnError
        }

        override suspend fun <T> invoke(method: VkMethod<T>): T {
            val result = this@throwExceptionsOnError(method)
            if (result.error != null)
                throw VkErrorException(result.error)

            return result.response!!
        }

        override val httpClient: HttpClient
            get() = this@throwExceptionsOnError.httpClient
    }
}

class MethodExecutorImpl(
    override val httpClient: HttpClient
) : MethodExecutor {


    override suspend fun <T> invoke(method: VkMethod<T>): VkResponse<T> {
        val params = method.props
            .filterValues { it != null }
            .mapKeys { restorePropNames(it) }
            .entries.map {
            Pair(
                caseConvert(it.key),
                toStringRequestValue(it.value)
            )
        }.toMap() + method.presetProps + mapOf("v" to VERSION)

        val httpRequest = POST(url = methodUrl(method), body = FormUrlEncoded(params))
        val response = httpClient(httpRequest)
        val vkResponse: VkResponse<T> = VK_OBJECT_MAPPER.readValue(response.data, method.classRef)
        return vkResponse
    }

    private fun methodUrl(method: VkMethod<*>) = URL_PREFIX + method.apiMethodName

    private fun restorePropNames(it: Map.Entry<String, Any?>): String {
        return when (it.key) {
            "cls" -> "class"
            "obj" -> "object"
            else -> it.key
        }
    }

    private fun toStringRequestValue(it: Any?): String {
        if (it is Array<*>)
            return it.joinToString(",")
        if (it is Keyboard)
            return VK_OBJECT_MAPPER.writeValueAsString(it)
        return it.toString()
    }

    companion object {
        const val URL_PREFIX = "https://api.vk.com/method/"
        const val VERSION = "5.87"
    }
}

fun caseConvert(s: String) = CamelCaseToLowerUnderscore(s)
fun CamelCaseToLowerUnderscore(s: String): String = s.replace("(.)(\\p{Upper})".toRegex(), "$1_$2").toLowerCase()

