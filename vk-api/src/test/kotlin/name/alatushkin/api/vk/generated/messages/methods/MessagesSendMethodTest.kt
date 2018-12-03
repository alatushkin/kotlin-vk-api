package name.alatushkin.api.vk.generated.messages.methods

import kotlinx.coroutines.runBlocking
import name.alatushkin.api.vk.groupId
import name.alatushkin.api.vk.groupTokenTestApi
import name.alatushkin.api.vk.peerId
import org.junit.Test

class MessagesSendMethodTest {
    @Test
    fun smoke1() = runBlocking {
        val result = groupTokenTestApi(
            MessagesSendMethod(
                peerId = peerId,
                groupId = groupId.toLong(),
                message = "test"
            )
        )
        println(result)

    }
}