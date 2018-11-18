package name.alatushkin.api.vk.generated.video

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class Sort(@JsonValue val jsonValue: String) {
    OLDEST_COMMENT_FIRST("asc"), NEWEST_COMMENT_FIRST("desc");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): Sort =
            Sort.values().find { it.jsonValue == value }!!
    }
}
