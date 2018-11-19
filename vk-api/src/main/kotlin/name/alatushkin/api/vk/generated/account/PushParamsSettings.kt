package name.alatushkin.api.vk.generated.account

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class PushParamsSettings(@JsonValue val jsonValue: String) {
    ON("on"), OFF("off");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): PushParamsSettings =
            PushParamsSettings.values().find { it.jsonValue == value }!!
    }
}
