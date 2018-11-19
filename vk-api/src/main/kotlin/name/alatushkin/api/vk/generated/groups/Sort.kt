package name.alatushkin.api.vk.generated.groups

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class Sort(@JsonValue val jsonValue: String) {
    ID_ASC("id_asc"), ID_DESC("id_desc"), TIME_ASC("time_asc"),
    TIME_DESC("time_desc");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): Sort =
            Sort.values().find { it.jsonValue == value }!!
    }
}
