package name.alatushkin.api.vk.generated.market

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class GetCommentsSort(@JsonValue val jsonValue: String) {
    OLD_TO_NEW("asc"), NEW_TO_OLD("desc");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GetCommentsSort =
            GetCommentsSort.values().find { it.jsonValue == value }!!
    }
}
