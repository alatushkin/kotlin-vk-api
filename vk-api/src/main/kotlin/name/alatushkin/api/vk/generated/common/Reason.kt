package name.alatushkin.api.vk.generated.common

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class Reason(@JsonValue val jsonValue: String) {
    SPAM("0"), CHILD_PORNOGRAPHY("1"), EXTREMISM("2"),
    VIOLENCE("3"), DRUG_PROPAGANDA("4"),
    ADULT_MATERIAL("5"), INSULT_ABUSE("6");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): Reason =
            Reason.values().find { it.jsonValue == value }!!
    }
}
