package name.alatushkin.api.vk.generated.newsfeed

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class NewsfeedItemType(@JsonValue val jsonValue: String) {
    POST("post"), PHOTO("photo"), PHOTO_TAG("photo_tag"), WALL_PHOTO("wall_photo"), FRIEND("friend"), NOTE("note"), AUDIO(
        "audio"
    ),
    VIDEO("video"), TOPIC("topic");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): NewsfeedItemType =
            NewsfeedItemType.values().find { it.jsonValue == value }!!
    }
}
