package name.alatushkin.api.vk.generated.ads

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class Lang(@JsonValue val jsonValue: String) {
    RUSSIAN("ru"), UKRAINIAN("ua"), ENGLISH("en");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): Lang =
            Lang.values().find { it.jsonValue == value }!!
    }
}
