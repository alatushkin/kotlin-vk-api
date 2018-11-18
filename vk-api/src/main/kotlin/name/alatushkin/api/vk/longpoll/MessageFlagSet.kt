package name.alatushkin.api.vk.longpoll

import com.fasterxml.jackson.databind.JsonNode

open class MessageFlagSet(jsonNodeArray: JsonNode) : MessageDeleted(jsonNodeArray) {
    internal var mask: Long = 0
    internal var userId: Long?

    init {
        mask = jsonNodeArray.get(2).asLong()
        userId = jsonNodeArray.get(3)?.asLong()
    }
}
