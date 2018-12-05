package name.alatushkin.api.vk.generated.messages

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class GetHistoryAttachmentsMediaType(@JsonValue val jsonValue: String) {
    PHOTO("photo"),
    VIDEO("video"),
    DOC("doc"),
    AUDIO("audio"),
    LINK("link"),
    MARKET("market"),
    WALL("wall"),
    SHARE("share");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GetHistoryAttachmentsMediaType =
            GetHistoryAttachmentsMediaType.values().find { it.jsonValue == value }!!
    }
}
