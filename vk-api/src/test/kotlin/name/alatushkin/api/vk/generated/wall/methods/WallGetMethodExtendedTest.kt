package name.alatushkin.api.vk.generated.wall.methods

import kotlinx.coroutines.runBlocking
import name.alatushkin.api.vk.SimpleMethodExecutor
import name.alatushkin.api.vk.groupAccessToken
import name.alatushkin.api.vk.groupId
import name.alatushkin.api.vk.tokens.GroupToken
import name.alatushkin.api.vk.tokens.withToken
import name.alatushkin.httpclient.httpClient
import org.junit.Test

class WallGetMethodExtendedTest {
    @Test
    fun smoke1() = runBlocking {
        val timeOut = 95
        val httpClient = httpClient(readTimeout = timeOut * 1000)
        val token = GroupToken(groupAccessToken, groupId.toLong())

        val api = SimpleMethodExecutor(httpClient).withToken(token)

        // Ошибка некорректного токена поймана на этапе компиляции
        //println(api(WallGetMethod(domain = "departureMsk")))
        Unit
    }

    @Test
    fun smoke2() = runBlocking {
        val timeOut = 95
        val httpClient = httpClient(readTimeout = timeOut * 1000)
        val token = GroupToken(groupAccessToken, groupId.toLong())

        val api = SimpleMethodExecutor(httpClient).withToken(token)

        // Ошибка некорректного токена поймана на этапе компиляции
        //println(api(WallGetMethodExtended(domain = "departureMsk")))
        Unit
    }
}