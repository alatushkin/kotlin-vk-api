package name.alatushkin.api.vk.generated.groups

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class GroupAdminLevel(@JsonValue val jsonValue: String) {
    MODERATOR("1"), EDITOR("2"), ADMINISTRATOR("3");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GroupAdminLevel =
            GroupAdminLevel.values().find { it.jsonValue == value }!!
    }
}
