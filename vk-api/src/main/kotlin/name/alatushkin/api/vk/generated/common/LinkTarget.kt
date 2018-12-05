package name.alatushkin.api.vk.generated.common

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class LinkTarget(@JsonValue val jsonValue: String) {
    INTERNAL("internal"),
    EXTERNAL("external"),
    OTHER("other");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): LinkTarget =
            LinkTarget.values().find { it.jsonValue == value }!!
    }
}
