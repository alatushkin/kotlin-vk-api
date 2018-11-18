package name.alatushkin.api.vk.generated.video

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class CatElementType(@JsonValue val jsonValue: String) {
    VIDEO("video"), ALBUM("album");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): CatElementType =
            CatElementType.values().find { it.jsonValue == value }!!
    }
}
