@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.updateCampaigns]
 *
 * Edits advertising campaigns.
 *
 * @property accountId Advertising account ID.
 * @property data Serialized JSON array of objects that describe changes in campaigns. Description of 'campaign_mod' objects see below.
 */
class AdsUpdateCampaignsMethod(
    accountId: Long,
    data: String
) : VkMethod<Long>(
    "ads.updateCampaigns",
    mutableMapOf(),
    successReference()
), UserMethod {

    var accountId: Long by props
    var data: String by props

    init {
        this.accountId = accountId
        this.data = data
    }
}
