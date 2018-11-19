package name.alatushkin.api.vk.generated.search

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class HintSection(@JsonValue val jsonValue: String) {
    GROUPS("groups"), EVENTS("events"), PUBLICS("publics"),
    CORRESPONDENTS("correspondents"), PEOPLE("people"),
    FRIENDS("friends");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): HintSection =
            HintSection.values().find { it.jsonValue == value }!!
    }
}
