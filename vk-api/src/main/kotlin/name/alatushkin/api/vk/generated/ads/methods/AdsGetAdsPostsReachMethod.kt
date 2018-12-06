@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.ads.PostStats
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getAdsPostsReach]
 *
 * Allows to get detailed information about the ad post reach.
 *
 * @property accountId Advertising account ID.
 * @property adsIds Ads IDS separated by comma.
 */
class AdsGetAdsPostsReachMethod(
    accountId: Long,
    adsIds: String
) : VkMethod<Array<PostStats>>(
    "ads.getAdsPostsReach",
    mutableMapOf(),
    successReference()
), UserMethod {

    var accountId: Long by props
    var adsIds: String by props

    init {
        this.accountId = accountId
        this.adsIds = adsIds
    }
}
