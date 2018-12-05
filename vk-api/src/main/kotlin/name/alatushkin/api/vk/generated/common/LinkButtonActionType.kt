package name.alatushkin.api.vk.generated.common

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class LinkButtonActionType(@JsonValue val jsonValue: String) {
    OPEN_URL("open_url");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): LinkButtonActionType =
            LinkButtonActionType.values().find { it.jsonValue == value }!!
    }
}
