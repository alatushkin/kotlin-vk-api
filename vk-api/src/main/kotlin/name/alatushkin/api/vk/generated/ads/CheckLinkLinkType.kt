package name.alatushkin.api.vk.generated.ads

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class CheckLinkLinkType(@JsonValue val jsonValue: String) {
    COMMUNITY("community"), POST("post"), APPLICATION("application"),
    VIDEO("video"), SITE("site");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): CheckLinkLinkType =
            CheckLinkLinkType.values().find { it.jsonValue == value }!!
    }
}
