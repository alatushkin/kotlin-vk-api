package name.alatushkin.api.vk.generated.groups

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class SearchSort(@JsonValue val jsonValue: String) {
    DEFAULT("0"), GROWTH("1"), ATTENDANCE("2"), LIKES("3"), COMMENTS("4"), ENTRIES("5");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): SearchSort =
            SearchSort.values().find { it.jsonValue == value }!!
    }
}
