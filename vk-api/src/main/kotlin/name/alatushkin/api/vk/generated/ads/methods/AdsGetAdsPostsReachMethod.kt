package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.ads.PostStats

/**
 *  Allows to get detailed information about the ad post reach.
 *
 *  [https://vk.com/dev/ads.getAdsPostsReach]
 *  @property [account_id] Advertising account ID.
 *  @property [ads_ids] Ads IDS separated by comma.
 */
class AdsGetAdsPostsReachMethod() : VkMethod<Array<PostStats>>(
    "ads.getAdsPostsReach",
    HashMap()
) {

    var accountId: Long? by props
    var adsIds: String? by props

    constructor(
        accountId: Long? = null,
        adsIds: String? = null
    ) : this() {
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

    override val classRef = AdsGetAdsPostsReachMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Array<PostStats>>>() {}
    }
}
