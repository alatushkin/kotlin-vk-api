package name.alatushkin.api.vk.generated.groups

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class EditAgeLimits(@JsonValue val jsonValue: String) {
    UNLIMITED("1"),
    PLUS_16("2"),
    PLUS_18("3");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): EditAgeLimits =
            EditAgeLimits.values().find { it.jsonValue == value }!!
    }
}
