package name.alatushkin.api.vk.longpoll

import com.fasterxml.jackson.databind.JsonNode

class OutgoingMessageReaded(jsonNodeArray: JsonNode) : IncomingMessageReaded(jsonNodeArray)
