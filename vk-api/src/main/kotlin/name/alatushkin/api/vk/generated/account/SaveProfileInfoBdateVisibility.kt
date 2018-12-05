package name.alatushkin.api.vk.generated.account

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class SaveProfileInfoBdateVisibility(@JsonValue val jsonValue: String) {
    SHOW("1"),
    HIDE_YEAR("2"),
    HIDE("0");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): SaveProfileInfoBdateVisibility =
            SaveProfileInfoBdateVisibility.values().find { it.jsonValue == value }!!
    }
}
