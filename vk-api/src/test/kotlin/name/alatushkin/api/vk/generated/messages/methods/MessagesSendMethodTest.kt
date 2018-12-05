package name.alatushkin.api.vk.generated.messages.methods

import kotlinx.coroutines.runBlocking
import name.alatushkin.api.vk.SimpleMethodExecutor
import name.alatushkin.api.vk.groupAccessToken
import name.alatushkin.api.vk.groupId
import name.alatushkin.api.vk.peerId
import name.alatushkin.api.vk.tokens.GroupToken
import name.alatushkin.api.vk.tokens.invoke
import name.alatushkin.api.vk.tokens.withToken
import name.alatushkin.httpclient.httpClient
import org.junit.Test

class MessagesSendMethodTest {
    @Test
    fun smoke1() = runBlocking {
        val timeOut = 95
        val httpClient = httpClient(readTimeout = timeOut * 1000)
        val token = GroupToken(groupAccessToken, groupId.toLong())
        val api = SimpleMethodExecutor(httpClient).withToken(token)

        val result = api(
            MessagesSendMethod(
//                userId=peerId,
                peerId = peerId,
                //chatId = peerId,
                groupId = groupId.toLong(),
                message = "test"
            )
        )
        println(result)
    }
}