package name.alatushkin.api.vk.generated.account

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class SaveProfileInfoSex(@JsonValue val jsonValue: String) {
    UNDEFINED("0"), FEMALE("1"), MALE("2");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): SaveProfileInfoSex =
            SaveProfileInfoSex.values().find { it.jsonValue == value }!!
    }
}
