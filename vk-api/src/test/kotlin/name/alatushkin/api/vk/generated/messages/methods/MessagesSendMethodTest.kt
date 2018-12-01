package name.alatushkin.api.vk.generated.messages.methods

import kotlinx.coroutines.runBlocking
import name.alatushkin.api.vk.*
import name.alatushkin.httpclient.httpClient
import org.junit.Test

class MessagesSendMethodTest {
    @Test
    fun smoke1() = runBlocking {
        val timeOut = 95
        val httpClient = httpClient(readTimeout = timeOut * 1000)
        val api: MethodExecutor = SimpleMethodExecutor(httpClient, groupAccessToken)

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