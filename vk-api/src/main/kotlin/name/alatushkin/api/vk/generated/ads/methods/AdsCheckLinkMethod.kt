@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.ads.CheckLinkLinkType
import name.alatushkin.api.vk.generated.ads.LinkStatus
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.checkLink]
 *
 * Allows to check the ad link.
 *
 * @property accountId Advertising account ID.
 * @property linkType Object type: *'community' — community,, *'post' — community post,, *'application' — VK application,, *'video' — video,, *'site' — external site.
 * @property linkUrl Object URL.
 * @property campaignId Campaign ID
 */
class AdsCheckLinkMethod(
        accountId: Long,
        linkType: CheckLinkLinkType,
        linkUrl: String,
        campaignId: Long? = null
) : VkMethod<LinkStatus>(
    "ads.checkLink",
    mutableMapOf(),
    object : TypeReference<VkResponse<LinkStatus>>() {}
), UserMethod {

    var accountId: Long by props
    var linkType: CheckLinkLinkType by props
    var linkUrl: String by props
    var campaignId: Long? by props

    init {
        this.accountId = accountId
        this.linkType = linkType
        this.linkUrl = linkUrl
        this.campaignId = campaignId
    }

    fun setAccountId(accountId: Long): AdsCheckLinkMethod {
        this.accountId = accountId
        return this
    }

    fun setLinkType(linkType: CheckLinkLinkType): AdsCheckLinkMethod {
        this.linkType = linkType
        return this
    }

    fun setLinkUrl(linkUrl: String): AdsCheckLinkMethod {
        this.linkUrl = linkUrl
        return this
    }

    fun setCampaignId(campaignId: Long): AdsCheckLinkMethod {
        this.campaignId = campaignId
        return this
    }
}
