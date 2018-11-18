package name.alatushkin.api.vk.generated.ads

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class IdsType(@JsonValue val jsonValue: String) {
    AD("ad"), CAMPAIGN("campaign"), CLIENT("client"), OFFICE("office");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): IdsType =
            IdsType.values().find { it.jsonValue == value }!!
    }
}
