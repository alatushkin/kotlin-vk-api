package name.alatushkin.api.vk.generated.newsfeed

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class ItemWallpostType(@JsonValue val jsonValue: String) {
    POST("post"), COPY("copy"), REPLY("reply");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): ItemWallpostType =
            ItemWallpostType.values().find { it.jsonValue == value }!!
    }
}
