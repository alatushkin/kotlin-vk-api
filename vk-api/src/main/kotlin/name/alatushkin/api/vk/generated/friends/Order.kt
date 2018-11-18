package name.alatushkin.api.vk.generated.friends

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class Order(@JsonValue val jsonValue: String) {
    NAME("name"), HINTS("hints");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): Order =
            Order.values().find { it.jsonValue == value }!!
    }
}
