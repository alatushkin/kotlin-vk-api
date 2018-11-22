package name.alatushkin.api.vk.generated.newsfeed

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class IgnoreItemType(@JsonValue val jsonValue: String) {
    POST_ON_THE_WALL("wall"), TAG_ON_A_PHOTO("tag"), PROFILE_PHOTO("profilephoto"),
    VIDEO("video"), AUDIO("audio");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): IgnoreItemType =
            IgnoreItemType.values().find { it.jsonValue == value }!!
    }
}
