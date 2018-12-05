package name.alatushkin.api.vk.generated.account

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class SaveProfileInfoRelation(@JsonValue val jsonValue: String) {
    SINGLE("1"),
    RELATIONSHIP("2"),
    ENGAGED("3"),
    MARRIED("4"),
    COMPLICATED("5"),
    ACTIVELY_SEARCHING("6"),
    IN_LOVE("7"),
    NOT_SPECIFIED("0");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): SaveProfileInfoRelation =
            SaveProfileInfoRelation.values().find { it.jsonValue == value }!!
    }
}
