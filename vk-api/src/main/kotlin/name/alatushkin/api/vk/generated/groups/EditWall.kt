package name.alatushkin.api.vk.generated.groups

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class EditWall(@JsonValue val jsonValue: String) {
    DISABLED("0"),
    OPEN("1"),
    LIMITED("2"),
    CLOSED("3");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): EditWall =
            EditWall.values().find { it.jsonValue == value }!!
    }
}
