package name.alatushkin.api.vk.generated.common

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class Sex(@JsonValue val jsonValue: String) {
    UNKNOWN("0"),
    FEMALE("1"),
    MALE("2");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): Sex =
            Sex.values().find { it.jsonValue == value }!!
    }
}
