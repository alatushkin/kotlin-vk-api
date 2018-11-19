package name.alatushkin.api.vk.generated.video

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class CatBlockView(@JsonValue val jsonValue: String) {
    HORIZONTAL("horizontal"), HORIZONTAL_COMPACT("horizontal_compact"), VERTICAL("vertical"),
    VERTICAL_COMPACT("vertical_compact");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): CatBlockView =
            CatBlockView.values().find { it.jsonValue == value }!!
    }
}
