package name.alatushkin.api.vk.longpoll

import com.fasterxml.jackson.databind.JsonNode

interface LongPollEventBuilder {
    val id: Int

    fun deserialize(jsonArrayNode: JsonNode): LongPollEvent
}