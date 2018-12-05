package name.alatushkin.api.vk.generated.groups

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class EditManagerRole(@JsonValue val jsonValue: String) {
    MODERATOR("moderator"),
    EDITOR("editor"),
    ADMINISTRATOR("administrator");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): EditManagerRole =
            EditManagerRole.values().find { it.jsonValue == value }!!
    }
}
