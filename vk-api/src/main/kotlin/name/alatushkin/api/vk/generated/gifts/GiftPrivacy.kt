package name.alatushkin.api.vk.generated.gifts

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class GiftPrivacy(@JsonValue val jsonValue: String) {
    NAME_AND_MESSAGE_FOR_ALL("0"), NAME_FOR_ALL("1"), NAME_AND_MESSAGE_FOR_RECIPIENT_ONLY("2");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GiftPrivacy =
            GiftPrivacy.values().find { it.jsonValue == value }!!
    }
}
