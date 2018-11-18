package name.alatushkin.api.vk.longpoll

import com.fasterxml.jackson.databind.JsonNode

open class IncomingMessageReaded(jsonNodeArray: JsonNode) : LongPollEvent(jsonNodeArray) {
    internal var peerId: Long = 0
    internal var localId: Long = 0

    init {
        peerId = jsonNodeArray.get(1).asLong()
        localId = jsonNodeArray.get(2).asLong()
    }
}
