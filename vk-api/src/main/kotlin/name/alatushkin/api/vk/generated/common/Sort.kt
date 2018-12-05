package name.alatushkin.api.vk.generated.common

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class Sort(@JsonValue val jsonValue: String) {
    CHRONOLOGICAL("asc"),
    REVERSE_CHRONOLOGICAL("desc");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): Sort =
            Sort.values().find { it.jsonValue == value }!!
    }
}
