package name.alatushkin.api.vk.generated.leads

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class GetUsersStatus(@JsonValue val jsonValue: String) {
    START("0"), FINISH("1"), BLOCKING_USERS("2"),
    START_IN_TEST_MODE("3"), FINISH_IN_TEST_MODE("4");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GetUsersStatus =
            GetUsersStatus.values().find { it.jsonValue == value }!!
    }
}
