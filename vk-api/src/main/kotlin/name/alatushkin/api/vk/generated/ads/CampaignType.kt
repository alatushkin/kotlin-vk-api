package name.alatushkin.api.vk.generated.ads

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class CampaignType(@JsonValue val jsonValue: String) {
    NORMAL("normal"), VK_APPS_MANAGED("vk_apps_managed"), MOBILE_APPS("mobile_apps"),
    PROMOTED_POSTS("promoted_posts");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): CampaignType =
            CampaignType.values().find { it.jsonValue == value }!!
    }
}
