package name.alatushkin.api.vk.generated.apps

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class SendRequestType(@JsonValue val jsonValue: String) {
    REQUEST("request"),
    INVITE("invite");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): SendRequestType =
            SendRequestType.values().find { it.jsonValue == value }!!
    }
}
