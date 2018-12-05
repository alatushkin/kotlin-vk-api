package name.alatushkin.api.vk.generated.pages

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class PrivacySettings(@JsonValue val jsonValue: String) {
    COMMUNITY_MANAGERS_ONLY("0"),
    COMMUNITY_MEMBERS_ONLY("1"),
    EVERYONE("2");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): PrivacySettings =
            PrivacySettings.values().find { it.jsonValue == value }!!
    }
}
