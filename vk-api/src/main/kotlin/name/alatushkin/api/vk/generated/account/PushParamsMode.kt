package name.alatushkin.api.vk.generated.account

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class PushParamsMode(@JsonValue val jsonValue: String) {
    ON("on"), OFF("off"), NO_SOUND("no_sound"),
    NO_TEXT("no_text");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): PushParamsMode =
            PushParamsMode.values().find { it.jsonValue == value }!!
    }
}
