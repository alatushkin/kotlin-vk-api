package name.alatushkin.api.vk.generated.leads

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class CheckedResult(@JsonValue val jsonValue: String) {
    TRUE("true"), FALSE("false");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): CheckedResult =
            CheckedResult.values().find { it.jsonValue == value }!!
    }
}
