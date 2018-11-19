package name.alatushkin.api.vk.generated.ads

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class TargSuggestionsSchoolsType(@JsonValue val jsonValue: String) {
    SCHOOL("school"), UNIVERSITY("university"), FACULTY("faculty"),
    CHAIR("chair");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): TargSuggestionsSchoolsType =
            TargSuggestionsSchoolsType.values().find { it.jsonValue == value }!!
    }
}
