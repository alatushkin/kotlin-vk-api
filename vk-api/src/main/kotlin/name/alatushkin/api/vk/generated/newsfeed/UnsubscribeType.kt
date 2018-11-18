package name.alatushkin.api.vk.generated.newsfeed

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class UnsubscribeType(@JsonValue val jsonValue: String) {
    NOTE("note"), PHOTO("photo"), POST("post"), TOPIC("topic"), VIDEO("video");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): UnsubscribeType =
            UnsubscribeType.values().find { it.jsonValue == value }!!
    }
}
