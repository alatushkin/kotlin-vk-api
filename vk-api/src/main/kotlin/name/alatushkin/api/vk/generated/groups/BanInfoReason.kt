package name.alatushkin.api.vk.generated.groups

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class BanInfoReason(@JsonValue val jsonValue: String) {
    OTHER("0"), SPAM("1"), VERBAL_ABUSE("2"),
    STRONG_LANGUAGE("3"), FLOOD("4");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): BanInfoReason =
            BanInfoReason.values().find { it.jsonValue == value }!!
    }
}
