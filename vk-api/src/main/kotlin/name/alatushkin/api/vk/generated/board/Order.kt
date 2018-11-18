package name.alatushkin.api.vk.generated.board

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class Order(@JsonValue val jsonValue: String) {
    UPDATED_DESC("1"), CREATED_DESC("2"), UPDATED_ASC("-1"), CREATED_ASC("-2"), AS_BY_ADMINISTRATOR("0");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): Order =
            Order.values().find { it.jsonValue == value }!!
    }
}
