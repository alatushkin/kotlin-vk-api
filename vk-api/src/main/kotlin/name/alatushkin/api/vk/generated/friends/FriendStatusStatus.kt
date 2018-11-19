package name.alatushkin.api.vk.generated.friends

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class FriendStatusStatus(@JsonValue val jsonValue: String) {
    NOT_A_FRIEND("0"), OUTCOMING_REQUEST("1"), INCOMING_REQUEST("2"),
    IS_FRIEND("3");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): FriendStatusStatus =
            FriendStatusStatus.values().find { it.jsonValue == value }!!
    }
}
