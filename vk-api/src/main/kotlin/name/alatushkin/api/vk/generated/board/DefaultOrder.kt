package name.alatushkin.api.vk.generated.board

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class DefaultOrder(@JsonValue val jsonValue: String) {
    DESC_UPDATED("1"), DESC_CREATED("2"), ASC_UPDATED("-1"),
    ASC_CREATED("-2");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): DefaultOrder =
            DefaultOrder.values().find { it.jsonValue == value }!!
    }
}
