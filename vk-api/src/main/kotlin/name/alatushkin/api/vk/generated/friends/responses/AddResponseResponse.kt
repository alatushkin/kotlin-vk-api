package name.alatushkin.api.vk.generated.friends.responses

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class AddResponseResponse(@JsonValue val jsonValue: String) {
    SEND("1"), APPROVED("2");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): AddResponseResponse =
            AddResponseResponse.values().find { it.jsonValue == value }!!
    }
}
