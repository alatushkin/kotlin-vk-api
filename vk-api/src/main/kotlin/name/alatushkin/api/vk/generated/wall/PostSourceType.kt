package name.alatushkin.api.vk.generated.wall

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class PostSourceType(@JsonValue val jsonValue: String) {
    VK("vk"),
    WIDGET("widget"),
    API("api"),
    RSS("rss"),
    SMS("sms");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): PostSourceType =
            PostSourceType.values().find { it.jsonValue == value }!!
    }
}
