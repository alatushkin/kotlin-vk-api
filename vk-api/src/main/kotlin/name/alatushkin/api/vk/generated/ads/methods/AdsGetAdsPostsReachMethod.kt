@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.ads.PostStats
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
    object : TypeReference<VkSuccess<Array<PostStats>>>() {}
), UserMethod {

    var accountId: Long by props
    var adsIds: String by props

    init {
        this.accountId = accountId
        this.adsIds = adsIds
    }

    fun setAccountId(accountId: Long): AdsGetAdsPostsReachMethod {
        this.accountId = accountId
        return this
    }

    fun setAdsIds(adsIds: String): AdsGetAdsPostsReachMethod {
        this.adsIds = adsIds
        return this
    }
}
