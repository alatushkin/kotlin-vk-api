package name.alatushkin.api.vk.generated.common

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class Mode(@JsonValue val jsonValue: String) {
    DISABLED("0"), OPEN("1"), LIMITED("2");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): Mode =
            Mode.values().find { it.jsonValue == value }!!
    }
}
