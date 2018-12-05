package name.alatushkin.api.vk.generated.ads

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class GetUploadURLAdFormat(@JsonValue val jsonValue: String) {
    IMAGE_AND_TEXT("1"),
    BIG_IMAGE("2"),
    EXCLUSIVE_FORMAT("3"),
    COMMUNITY_SQUARE_IMAGE("4"),
    SPECIAL_APP_FORMAT("7");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GetUploadURLAdFormat =
            GetUploadURLAdFormat.values().find { it.jsonValue == value }!!
    }
}
