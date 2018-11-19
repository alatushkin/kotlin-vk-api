package name.alatushkin.api.vk.generated.auth

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class SignupSex(@JsonValue val jsonValue: String) {
    UNDEFINED("0"), FEMALE("1");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): SignupSex =
            SignupSex.values().find { it.jsonValue == value }!!
    }
}
