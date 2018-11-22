package name.alatushkin.api.vk.generated.photos

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class AlbumId(@JsonValue val jsonValue: String) {
    PROFILE("profile"), WALL("wall"), SAVED("saved");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): AlbumId =
            AlbumId.values().find { it.jsonValue == value }!!
    }
}
