package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.ads.RejectReason

/**
 *  Returns a reason of ad rejection for pre-moderation.
 *
 *  [https://vk.com/dev/ads.getRejectionReason]
 *  @property [account_id] Advertising account ID.
 *  @property [ad_id] Ad ID.
 */
class AdsGetRejectionReasonMethod() : VkMethod<RejectReason>(
    "ads.getRejectionReason",
    HashMap()
) {

    var accountId: Long? by props
    var adId: Long? by props

    constructor(
        accountId: Long? = null,
        adId: Long? = null
    ) : this() {
        this.accountId = accountId
        this.adId = adId
    }

    fun setAccountId(accountId: Long): AdsGetRejectionReasonMethod {
        this.accountId = accountId
        return this
    }

    fun setAdId(adId: Long): AdsGetRejectionReasonMethod {
        this.adId = adId
        return this
    }

    override val classRef = AdsGetRejectionReasonMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<RejectReason>>() {}
    }
}
