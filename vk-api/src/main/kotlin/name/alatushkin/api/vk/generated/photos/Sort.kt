package name.alatushkin.api.vk.generated.photos

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class Sort(@JsonValue val jsonValue: String) {
    OLD_FIRST("asc"), NEW_FIRST("desc");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): Sort =
            Sort.values().find { it.jsonValue == value }!!
    }
}
