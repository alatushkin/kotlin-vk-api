package name.alatushkin.api.vk.generated.utils

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class Interval(@JsonValue val jsonValue: String) {
    HOUR("hour"), DAY("day"), WEEK("week"), MONTH("month"), FOREVER("forever");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): Interval =
            Interval.values().find { it.jsonValue == value }!!
    }
}
