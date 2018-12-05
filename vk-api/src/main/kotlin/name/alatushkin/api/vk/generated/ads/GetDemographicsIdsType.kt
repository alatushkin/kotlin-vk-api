package name.alatushkin.api.vk.generated.ads

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class GetDemographicsIdsType(@JsonValue val jsonValue: String) {
    AD("ad"),
    CAMPAIGN("campaign");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GetDemographicsIdsType =
            GetDemographicsIdsType.values().find { it.jsonValue == value }!!
    }
}
