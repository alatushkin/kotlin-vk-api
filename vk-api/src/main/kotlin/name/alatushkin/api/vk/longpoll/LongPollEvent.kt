package name.alatushkin.api.vk.longpoll

import com.fasterxml.jackson.databind.JsonNode

abstract class LongPollEvent(jsonNodeArray: JsonNode) {
    internal var event: Events

    init {
        this.event = Events.byId(jsonNodeArray.get(0).asInt())!!
    }
}