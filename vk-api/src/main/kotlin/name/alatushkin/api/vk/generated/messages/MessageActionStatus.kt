package name.alatushkin.api.vk.generated.messages

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class MessageActionStatus(@JsonValue val jsonValue: String) {
    CHAT_PHOTO_UPDATE("chat_photo_update"),
    CHAT_PHOTO_REMOVE("chat_photo_remove"),
    CHAT_CREATE("chat_create"),
    CHAT_TITLE_UPDATE("chat_title_update"),
    CHAT_INVITE_USER("chat_invite_user"),
    CHAT_KICK_USER("chat_kick_user"),
    CHAT_PIN_MESSAGE("chat_pin_message"),
    CHAT_UNPIN_MESSAGE("chat_unpin_message"),
    CHAT_INVITE_USER_BY_LINK("chat_invite_user_by_link");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): MessageActionStatus =
            MessageActionStatus.values().find { it.jsonValue == value }!!
    }
}
