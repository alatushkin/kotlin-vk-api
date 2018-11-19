package name.alatushkin.api.vk.generated.groups

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class OnlineStatusType(@JsonValue val jsonValue: String) {
    NONE("none"), ONLINE("online");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): OnlineStatusType =
            OnlineStatusType.values().find { it.jsonValue == value }!!
    }
}
