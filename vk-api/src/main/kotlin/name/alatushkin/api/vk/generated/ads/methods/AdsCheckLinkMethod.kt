@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.ads.CheckLinkLinkType
import name.alatushkin.api.vk.generated.ads.LinkStatus
import name.alatushkin.api.vk.successReference
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
    successReference()
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
}
