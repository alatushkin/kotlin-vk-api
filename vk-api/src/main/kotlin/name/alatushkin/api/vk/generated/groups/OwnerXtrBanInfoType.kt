package name.alatushkin.api.vk.generated.groups

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class OwnerXtrBanInfoType(@JsonValue val jsonValue: String) {
    GROUP("group"),
    PROFILE("profile");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): OwnerXtrBanInfoType =
            OwnerXtrBanInfoType.values().find { it.jsonValue == value }!!
    }
}
