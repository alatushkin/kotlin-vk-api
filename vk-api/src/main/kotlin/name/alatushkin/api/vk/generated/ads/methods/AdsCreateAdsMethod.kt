package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Creates ads.
 *
 *  [https://vk.com/dev/ads.createAds]
 *  @property [account_id] Advertising account ID.
 *  @property [data] Serialized JSON array of objects that describe created ads. Description of 'ad_specification' objects see below.
 */
class AdsCreateAdsMethod() : VkMethod<Array<Long>>(
    "ads.createAds",
    HashMap()
) {

    var accountId: Long? by props
    var data: String? by props

    constructor(
        accountId: Long? = null,
        data: String? = null
    ) : this() {
        this.accountId = accountId
        this.data = data
    }

    fun setAccountId(accountId: Long): AdsCreateAdsMethod {
        this.accountId = accountId
        return this
    }

    fun setData(data: String): AdsCreateAdsMethod {
        this.data = data
        return this
    }

    override val classRef = AdsCreateAdsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Array<Long>>>() {}
    }
}
