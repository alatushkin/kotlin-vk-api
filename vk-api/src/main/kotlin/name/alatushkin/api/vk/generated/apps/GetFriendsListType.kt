package name.alatushkin.api.vk.generated.apps

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class GetFriendsListType(@JsonValue val jsonValue: String) {
    REQUEST("request"), INVITE("invite");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GetFriendsListType =
            GetFriendsListType.values().find { it.jsonValue == value }!!
    }
}
