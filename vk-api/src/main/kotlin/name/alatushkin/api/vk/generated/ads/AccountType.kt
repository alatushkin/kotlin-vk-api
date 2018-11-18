package name.alatushkin.api.vk.generated.ads

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class AccountType(@JsonValue val jsonValue: String) {
    GENERAL("general"), AGENCY("agency");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): AccountType =
            AccountType.values().find { it.jsonValue == value }!!
    }
}
