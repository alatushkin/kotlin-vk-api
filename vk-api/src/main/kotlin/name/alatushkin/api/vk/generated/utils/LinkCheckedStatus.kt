package name.alatushkin.api.vk.generated.utils

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class LinkCheckedStatus(@JsonValue val jsonValue: String) {
    NOT_BANNED("not_banned"), BANNED("banned");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): LinkCheckedStatus =
            LinkCheckedStatus.values().find { it.jsonValue == value }!!
    }
}
