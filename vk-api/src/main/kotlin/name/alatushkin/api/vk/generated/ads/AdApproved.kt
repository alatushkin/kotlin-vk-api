package name.alatushkin.api.vk.generated.ads

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class AdApproved(@JsonValue val jsonValue: String) {
    NOT_MODERATED("0"), PENDING_MODERATION("1"), APPROVED("2"),
    REJECTED("3");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): AdApproved =
            AdApproved.values().find { it.jsonValue == value }!!
    }
}
