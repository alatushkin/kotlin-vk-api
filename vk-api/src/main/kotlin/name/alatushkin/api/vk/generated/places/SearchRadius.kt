package name.alatushkin.api.vk.generated.places

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class SearchRadius(@JsonValue val jsonValue: String) {
    M_100("1"), M_800("2"), KM_6("3"),
    KM_50("4");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): SearchRadius =
            SearchRadius.values().find { it.jsonValue == value }!!
    }
}
