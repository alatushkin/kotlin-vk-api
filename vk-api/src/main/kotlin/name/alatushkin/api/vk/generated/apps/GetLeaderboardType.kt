package name.alatushkin.api.vk.generated.apps

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class GetLeaderboardType(@JsonValue val jsonValue: String) {
    LEVEL("level"),
    POINTS("points"),
    SCORE("score");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GetLeaderboardType =
            GetLeaderboardType.values().find { it.jsonValue == value }!!
    }
}
