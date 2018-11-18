package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Archives ads.
 *
 *  [https://vk.com/dev/ads.deleteAds]
 *  @property [account_id] Advertising account ID.
 *  @property [ids] Serialized JSON array with ad IDs.
 */
class AdsDeleteAdsMethod() : VkMethod<Array<Long>>(
    "ads.deleteAds",
    HashMap()
) {

    var accountId: Long? by props
    var ids: String? by props

    constructor(
        accountId: Long? = null,
        ids: String? = null
    ) : this() {
        this.accountId = accountId
        this.ids = ids
    }

    fun setAccountId(accountId: Long): AdsDeleteAdsMethod {
        this.accountId = accountId
        return this
    }

    fun setIds(ids: String): AdsDeleteAdsMethod {
        this.ids = ids
        return this
    }

    override val classRef = AdsDeleteAdsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Array<Long>>>() {}
    }
}
