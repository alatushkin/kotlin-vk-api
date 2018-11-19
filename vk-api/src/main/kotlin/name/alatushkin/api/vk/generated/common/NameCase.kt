package name.alatushkin.api.vk.generated.common

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class NameCase(@JsonValue val jsonValue: String) {
    NOMINATIVE("nom"), GENITIVE("gen"), DATIVE("dat"),
    ACCUSATIVE("acc"), INSTRUMENTAL("ins"),
    PREPOSITIONAL("abl");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): NameCase =
            NameCase.values().find { it.jsonValue == value }!!
    }
}
