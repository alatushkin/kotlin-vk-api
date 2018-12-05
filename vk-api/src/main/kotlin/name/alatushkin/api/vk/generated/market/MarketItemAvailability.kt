package name.alatushkin.api.vk.generated.market

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class MarketItemAvailability(@JsonValue val jsonValue: String) {
    AVAILABLE("0"),
    REMOVED("1"),
    UNAVAILABLE("2");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): MarketItemAvailability =
            MarketItemAvailability.values().find { it.jsonValue == value }!!
    }
}
