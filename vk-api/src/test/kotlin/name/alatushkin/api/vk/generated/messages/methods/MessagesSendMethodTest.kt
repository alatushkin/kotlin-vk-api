package name.alatushkin.api.vk.generated.messages.methods

import kotlinx.coroutines.runBlocking
import name.alatushkin.api.vk.groupApi
import name.alatushkin.api.vk.groupId
import name.alatushkin.api.vk.peerId
import name.alatushkin.api.vk.tokens.invoke
import org.junit.Test

class MessagesSendMethodTest {
    @Test
    fun smoke1() = runBlocking {
        val result = groupApi(MessagesSendMethod(
                peerId = peerId,
                groupId = groupId.toLong(),
                message = "test"
        ))
        println(result)
    }
}