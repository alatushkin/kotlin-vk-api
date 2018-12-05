package name.alatushkin.api.vk.generated.ads

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class GetTargetingStatsAdFormat(@JsonValue val jsonValue: String) {
    IMAGE_AND_TEXT("1"),
    BIG_IMAGE("2"),
    EXCLUSIVE_FORMAT("3"),
    COMMUNITY_SQUARE_IMAGE("4"),
    SPECIAL_APP_FORMAT("7"),
    SPECIAL_COMMUNITY_FORMAT("8"),
    POST_IN_COMMUNITY("9"),
    APP_BOARD("10");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GetTargetingStatsAdFormat =
            GetTargetingStatsAdFormat.values().find { it.jsonValue == value }!!
    }
}
