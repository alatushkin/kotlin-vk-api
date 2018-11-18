package name.alatushkin.api.vk.longpoll

import com.fasterxml.jackson.databind.JsonNode
import name.alatushkin.api.vk.json.LongPollEventsDeserializer

data class LongPollResponse(val ts: Long, val updates: JsonNode?, val failed: Int?) {
    val decodedUpdates: List<LongPollEvent>
        get()
        = LongPollEventsDeserializer.decode(updates!!)
}

