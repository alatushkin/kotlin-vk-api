package name.alatushkin.api.vk.generated.wall.methods

import kotlinx.coroutines.runBlocking
import name.alatushkin.api.vk.MethodExecutorImpl
import name.alatushkin.api.vk.userAccessToken
import name.alatushkin.api.vk.withToken
import name.alatushkin.httpclient.httpClient
import org.junit.Test

class WallGetMethodExtendedTest {
    @Test
    fun smoke1() = runBlocking {
        val timeOut = 95
        val httpClient = httpClient(readTimeout = timeOut * 1000)
        val api = MethodExecutorImpl(httpClient).withToken(userAccessToken)

        val result = api(
            WallGetMethod(
                domain = "departureMsk"
            )
        )
        println(result)

    }

}