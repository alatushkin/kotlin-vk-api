package name.alatushkin.api.vk.generated.groups

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class Access(@JsonValue val jsonValue: String) {
    OPEN("0"), CLOSED("1");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): Access =
            Access.values().find { it.jsonValue == value }!!
    }
}
