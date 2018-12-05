package name.alatushkin.api.vk.generated.likes

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class Filter(@JsonValue val jsonValue: String) {
    LIKES("likes"),
    COPIES("copies");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): Filter =
            Filter.values().find { it.jsonValue == value }!!
    }
}
