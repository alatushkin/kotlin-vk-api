package name.alatushkin.api.vk.generated.groups

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class MemberRoleStatus(@JsonValue val jsonValue: String) {
    MODERATOR("moderator"), EDITOR("editor"), ADMINISTRATOR("administrator"),
    CREATOR("creator");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): MemberRoleStatus =
            MemberRoleStatus.values().find { it.jsonValue == value }!!
    }
}
