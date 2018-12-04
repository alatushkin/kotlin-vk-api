package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.ads.CheckLinkLinkType
import name.alatushkin.api.vk.generated.ads.LinkStatus

/**
 *  Allows to check the ad link.
 *
 *  [https://vk.com/dev/ads.checkLink]
 *  @property [account_id] Advertising account ID.
 *  @property [link_type] Object type: *'community' — community,, *'post' — community post,, *'application' — VK application,, *'video' — video,, *'site' — external site.
 *  @property [link_url] Object URL.
 *  @property [campaign_id] Campaign ID
 */
class AdsCheckLinkMethod() : VkMethod<LinkStatus>(
    "ads.checkLink",
    HashMap()
) {

    var accountId: Long? by props
    var linkType: CheckLinkLinkType? by props
    var linkUrl: String? by props
    var campaignId: Long? by props

    constructor(
        accountId: Long? = null,
        linkType: CheckLinkLinkType? = null,
        linkUrl: String? = null,
        campaignId: Long? = null
    ) : this() {
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

    override val classRef = AdsCheckLinkMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<LinkStatus>>() {}
    }
}
