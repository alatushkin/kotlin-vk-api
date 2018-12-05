package name.alatushkin.api.vk.generated.utils

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class DomainResolvedType(@JsonValue val jsonValue: String) {
    USER("user"),
    GROUP("group"),
    APPLICATION("application"),
    PAGE("page");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): DomainResolvedType =
            DomainResolvedType.values().find { it.jsonValue == value }!!
    }
}
