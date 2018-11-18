package name.alatushkin.api.vk.longpoll

import com.fasterxml.jackson.databind.JsonNode

open class MessageDeleted(jsonNodeArray: JsonNode) : LongPollEvent(jsonNodeArray) {
    val messageId: Long = jsonNodeArray.get(1).asLong()
}
