package name.alatushkin.api.vk.generated.newsfeed

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class UnignoreItemType(@JsonValue val jsonValue: String) {
    WALL("wall"), TAG("tag"), PROFILEPHOTO("profilephoto"),
    VIDEO("video");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): UnignoreItemType =
            UnignoreItemType.values().find { it.jsonValue == value }!!
    }
}
