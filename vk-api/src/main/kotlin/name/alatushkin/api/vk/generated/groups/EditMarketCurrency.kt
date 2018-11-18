package name.alatushkin.api.vk.generated.groups

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class EditMarketCurrency(@JsonValue val jsonValue: String) {
    RUSSIAN_RUBLES("643"), UKRAINIAN_HRYVNIA("980"), KAZAKH_TENGE("398"), EURO("978"), US_DOLLARS("840");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): EditMarketCurrency =
            EditMarketCurrency.values().find { it.jsonValue == value }!!
    }
}
