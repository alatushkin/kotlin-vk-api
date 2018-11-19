package name.alatushkin.api.vk.generated.messages

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class HistoryMessageAttachmentType(@JsonValue val jsonValue: String) {
    PHOTO("photo"), VIDEO("video"), AUDIO("audio"),
    DOC("doc"), LINK("link"),
    MARKET("market"), WALL("wall"),
    SHARE("share");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): HistoryMessageAttachmentType =
            HistoryMessageAttachmentType.values().find { it.jsonValue == value }!!
    }
}
