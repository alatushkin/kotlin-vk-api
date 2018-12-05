package name.alatushkin.api.vk.generated.wall

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class PostType(@JsonValue val jsonValue: String) {
    POST("post"),
    COPY("copy"),
    REPLY("reply"),
    POSTPONE("postpone"),
    SUGGEST("suggest");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): PostType =
            PostType.values().find { it.jsonValue == value }!!
    }
}
