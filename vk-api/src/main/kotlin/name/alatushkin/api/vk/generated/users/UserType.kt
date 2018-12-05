package name.alatushkin.api.vk.generated.users

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class UserType(@JsonValue val jsonValue: String) {
    PROFILE("profile");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): UserType =
            UserType.values().find { it.jsonValue == value }!!
    }
}
