package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.ads.GetTargetingStatsAdFormat
import name.alatushkin.api.vk.generated.ads.TargStats

/**
 *  Returns the size of targeting audience, and also recommended values for CPC and CPM.
 *
 *  [https://vk.com/dev/ads.getTargetingStats]
 *  @property [account_id] Advertising account ID.
 *  @property [criteria] Serialized JSON object that describes targeting parameters. Description of 'criteria' object see below.
 *  @property [ad_id] ID of an ad which targeting parameters shall be analyzed.
 *  @property [ad_format] Ad format. Possible values: *'1' — image and text,, *'2' — big image,, *'3' — exclusive format,, *'4' — community, square image,, *'7' — special app format,, *'8' — special community format,, *'9' — post in community,, *'10' — app board.
 *  @property [ad_platform] Platforms to use for ad showing. Possible values: (for 'ad_format' = '1'), *'0' — VK and partner sites,, *'1' — VK only. (for 'ad_format' = '9'), *'all' — all platforms,, *'desktop' — desktop version,, *'mobile' — mobile version and apps.
 *  @property [link_url] URL for the advertised object.
 *  @property [link_domain] Domain of the advertised object.
 */
class AdsGetTargetingStatsMethod() : VkMethod<TargStats>(
    "ads.getTargetingStats",
    HashMap()
) {

    var accountId: Long? by props
    var criteria: String? by props
    var adId: Long? by props
    var adFormat: GetTargetingStatsAdFormat? by props
    var adPlatform: String? by props
    var linkUrl: String? by props
    var linkDomain: String? by props

    constructor(
        accountId: Long? = null,
        criteria: String? = null,
        adId: Long? = null,
        adFormat: GetTargetingStatsAdFormat? = null,
        adPlatform: String? = null,
        linkUrl: String? = null,
        linkDomain: String? = null
    ) : this() {
        this.accountId = accountId
        this.criteria = criteria
        this.adId = adId
        this.adFormat = adFormat
        this.adPlatform = adPlatform
        this.linkUrl = linkUrl
        this.linkDomain = linkDomain
    }

    fun setAccountId(accountId: Long): AdsGetTargetingStatsMethod {
        this.accountId = accountId
        return this
    }

    fun setCriteria(criteria: String): AdsGetTargetingStatsMethod {
        this.criteria = criteria
        return this
    }

    fun setAdId(adId: Long): AdsGetTargetingStatsMethod {
        this.adId = adId
        return this
    }

    fun setAdFormat(adFormat: GetTargetingStatsAdFormat): AdsGetTargetingStatsMethod {
        this.adFormat = adFormat
        return this
    }

    fun setAdPlatform(adPlatform: String): AdsGetTargetingStatsMethod {
        this.adPlatform = adPlatform
        return this
    }

    fun setLinkUrl(linkUrl: String): AdsGetTargetingStatsMethod {
        this.linkUrl = linkUrl
        return this
    }

    fun setLinkDomain(linkDomain: String): AdsGetTargetingStatsMethod {
        this.linkDomain = linkDomain
        return this
    }

    override val classRef = AdsGetTargetingStatsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<TargStats>>() {}
    }
}
