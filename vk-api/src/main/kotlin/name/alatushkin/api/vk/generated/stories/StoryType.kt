package name.alatushkin.api.vk.generated.stories

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class StoryType(@JsonValue val jsonValue: String) {
    PHOTO("photo"),
    VIDEO("video");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): StoryType =
            StoryType.values().find { it.jsonValue == value }!!
    }
}
