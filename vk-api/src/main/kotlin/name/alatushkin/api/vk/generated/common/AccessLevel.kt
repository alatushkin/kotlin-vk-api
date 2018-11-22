package name.alatushkin.api.vk.generated.common

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class AccessLevel(@JsonValue val jsonValue: String) {
    MANAGERS("0"), MEMBERS("1"), ALL("2");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): AccessLevel =
            AccessLevel.values().find { it.jsonValue == value }!!
    }
}
