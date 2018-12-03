package name.alatushkin.api.vk.generated.wall.methods

import kotlinx.coroutines.runBlocking
import name.alatushkin.api.vk.SimpleMethodExecutor
import name.alatushkin.api.vk.VkClient
import name.alatushkin.api.vk.groupAccessToken
import name.alatushkin.api.vk.withToken
import name.alatushkin.httpclient.httpClient
import org.junit.Test

class WallGetMethodExtendedTest {
    @Test
    fun smoke1() = runBlocking {
        val timeOut = 95
        val httpClient = httpClient(readTimeout = timeOut * 1000)
        val api: VkClient = SimpleMethodExecutor(httpClient).withToken(groupAccessToken)

        val result = api(
            WallGetMethod(
                domain = "departureMsk"
            )
        )
        println(result)
        Unit
    }

    @Test
    fun smoke2() = runBlocking {
        val timeOut = 95
        val httpClient = httpClient(readTimeout = timeOut * 1000)
        val api: VkClient = SimpleMethodExecutor(httpClient).withToken(groupAccessToken)

        val result = api(
            WallGetMethodExtended(
                domain = "departureMsk"
            )
        )
        println(result)
        Unit
    }
}