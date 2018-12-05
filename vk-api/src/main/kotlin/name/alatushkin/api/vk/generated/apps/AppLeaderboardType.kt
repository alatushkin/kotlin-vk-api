package name.alatushkin.api.vk.generated.apps

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class AppLeaderboardType(@JsonValue val jsonValue: String) {
    NOT_SUPPORTED("0"),
    LEVELS("1"),
    POINTS("2");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): AppLeaderboardType =
            AppLeaderboardType.values().find { it.jsonValue == value }!!
    }
}
