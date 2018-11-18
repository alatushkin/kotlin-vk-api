package name.alatushkin.api.vk.generated.users

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class GetNearbyRadius(@JsonValue val jsonValue: String) {
    ANY("0"), M_300("1"), M_2400("2"), KM_18("3"), _150_KM_("4");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GetNearbyRadius =
            GetNearbyRadius.values().find { it.jsonValue == value }!!
    }
}
