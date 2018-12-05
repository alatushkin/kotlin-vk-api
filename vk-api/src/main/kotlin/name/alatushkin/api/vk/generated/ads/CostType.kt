package name.alatushkin.api.vk.generated.ads

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class CostType(@JsonValue val jsonValue: String) {
    PER_CLICKS("0"),
    PER_IMPRESSIONS("1");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): CostType =
            CostType.values().find { it.jsonValue == value }!!
    }
}
