package name.alatushkin.api.vk.generated.messages

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class KeyboardButtonActionType(@JsonValue val jsonValue: String) {
    TEXT("text"), START("start");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): KeyboardButtonActionType =
            KeyboardButtonActionType.values().find { it.jsonValue == value }!!
    }
}
