package name.alatushkin.api.vk.generated.groups

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class GroupFullMainSection(@JsonValue val jsonValue: String) {
    ABSENT("0"),
    PHOTOS("1"),
    TOPICS("2"),
    AUDIO("3"),
    VIDEO("4"),
    MARKET("5");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GroupFullMainSection =
            GroupFullMainSection.values().find { it.jsonValue == value }!!
    }
}
