package name.alatushkin.api.vk.generated.groups

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class CreateType(@JsonValue val jsonValue: String) {
    GROUP("group"), PUBLIC("public");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): CreateType =
            CreateType.values().find { it.jsonValue == value }!!
    }
}
