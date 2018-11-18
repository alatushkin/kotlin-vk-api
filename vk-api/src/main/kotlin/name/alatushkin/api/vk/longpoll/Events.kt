package name.alatushkin.api.vk.longpoll

import com.fasterxml.jackson.databind.JsonNode
import org.slf4j.LoggerFactory

enum class Events(private val id: Int, creator: ((JsonNode) -> LongPollEvent?) = { null }) {

    MESSAGE_DELETED(0, ::MessageAdded),
    MESSAGE_FLAGS_RESET(1, ::MessageFlagsReset),
    MESSAGE_FLAGS_SET(2, ::MessageFlagSet),
    MESSAGE_FLAGS_CLEAR(3, ::MessageFlagClear),
    MESSAGE_ADDED(4, ::MessageAdded),
    INCOMING_MESSAGES_READED(6, ::IncomingMessageReaded),
    OUTGOING_MESSAGES_READED(7, ::OutgoingMessageReaded),
    USER_BECOME_ONLINE(8),
    USER_BECOME_ONFFLINE(9),
    CLEAR_FILTER_FLAGS(10),
    RESET_FILTER_FLAGS(11),
    SET_FILTER_FLAGS(12),
    RESET_MESSAGE_FLAGS(13),
    SET_MESSAGE_FLAGS(14),
    CLEAR_MESSAGE_FLAGS(15),
    CHAT_PARAM_CHANGED(51),
    USER_TYPING_IN_CHAT(61),
    USER_TYPING_IN_DIALOG(62),
    USER_CALLING(70),
    NEW_COUNTER_VALUE(80),
    NOTIFICATION_SETTINGS_CHANGED(114);

    private val creator: ((JsonNode) -> LongPollEvent?) = creator


    fun create(jsonArray: JsonNode): LongPollEvent? {
        val result = creator(jsonArray)
        if (result == null) {
            log.warn("Not implemented for event {}", jsonArray.toString())
        }
        return result

    }

    companion object {

        fun byId(id: Int): Events? {
            val result = Events.values().find { it.id == id }
            if (result == null) {
                log.warn("Unknown event ID {}", id)
            }

            return result
        }

        val log = LoggerFactory.getLogger(Events::class.java)
    }
}
