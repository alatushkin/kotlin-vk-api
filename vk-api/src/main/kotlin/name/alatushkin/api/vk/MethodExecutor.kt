package name.alatushkin.api.vk

import name.alatushkin.api.vk.api.VkErrorException
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.httpclient.HttpClient

interface MethodExecutor {
    suspend operator fun <T> invoke(method: VkMethod<T>): VkResponse<T>
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

interface MethodExecutorWithException {
    @Throws(VkErrorException::class)
    suspend operator fun <T> invoke(method: VkMethod<T>): T

    fun asMethodExecutor(): MethodExecutor
    val httpClient: HttpClient
}

fun caseConvert(s: String) = CamelCaseToLowerUnderscore(s)
fun CamelCaseToLowerUnderscore(s: String): String = s.replace("(.)(\\p{Upper})".toRegex(), "$1_$2").toLowerCase()

