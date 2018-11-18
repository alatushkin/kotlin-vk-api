package name.alatushkin.api.vk.generated.groups

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class GroupXtrInvitedByType(@JsonValue val jsonValue: String) {
    GROUP("group"), PAGE("page"), EVENT("event");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GroupXtrInvitedByType =
            GroupXtrInvitedByType.values().find { it.jsonValue == value }!!
    }
}
