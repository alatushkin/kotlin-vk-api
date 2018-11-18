package name.alatushkin.api.vk.generated.groups

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class Filter(@JsonValue val jsonValue: String) {
    FRIENDS("friends"), UNSURE("unsure");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): Filter =
            Filter.values().find { it.jsonValue == value }!!
    }
}
