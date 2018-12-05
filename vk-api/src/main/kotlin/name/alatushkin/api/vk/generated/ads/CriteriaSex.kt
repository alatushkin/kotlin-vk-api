package name.alatushkin.api.vk.generated.ads

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class CriteriaSex(@JsonValue val jsonValue: String) {
    ANY("0"),
    MALE("1"),
    FEMALE("2");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): CriteriaSex =
            CriteriaSex.values().find { it.jsonValue == value }!!
    }
}
