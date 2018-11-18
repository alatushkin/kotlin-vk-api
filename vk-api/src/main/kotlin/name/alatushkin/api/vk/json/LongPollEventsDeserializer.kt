package name.alatushkin.api.vk.json

import com.fasterxml.jackson.databind.JsonNode
import name.alatushkin.api.vk.longpoll.Events
import name.alatushkin.api.vk.longpoll.LongPollEvent
import name.alatushkin.api.vk.longpoll.MessageAdded
import org.slf4j.LoggerFactory

object LongPollEventsDeserializer {
    fun decode(updatesNode: JsonNode): List<MessageAdded> {
        return updatesNode.iterator().asSequence()
            .map { updateNode ->
                val event = Events.byId(updateNode.get(0).asInt())?.create(updateNode)
                decodeSingleEvent(event)
            }
            .filterNotNull().toList()
    }

    private fun decodeSingleEvent(event: LongPollEvent?): MessageAdded? {
        if (event == null)
            return null

        return if (event.event === Events.MESSAGE_ADDED) {
            MessageAdded::class.java.cast(event)
        } else null
    }


    val log = LoggerFactory.getLogger(LongPollEventsDeserializer::class.java)
}
