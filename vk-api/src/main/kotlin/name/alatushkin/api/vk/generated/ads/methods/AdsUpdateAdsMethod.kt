package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Edits ads.
 *
 *  [https://vk.com/dev/ads.updateAds]
 *  @property [account_id] Advertising account ID.
 *  @property [data] Serialized JSON array of objects that describe changes in ads. Description of 'ad_edit_specification' objects see below.
 */
class AdsUpdateAdsMethod() : VkMethod<Array<Long>>(
    "ads.updateAds",
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

    fun setAccountId(accountId: Long): AdsUpdateAdsMethod {
        this.accountId = accountId
        return this
    }

    fun setData(data: String): AdsUpdateAdsMethod {
        this.data = data
        return this
    }

    override val classRef = AdsUpdateAdsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Array<Long>>>() {}
    }
}
