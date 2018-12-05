@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.ads.RejectReason
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getRejectionReason]
 *
 * Returns a reason of ad rejection for pre-moderation.
 *
 * @property accountId Advertising account ID.
 * @property adId Ad ID.
 */
class AdsGetRejectionReasonMethod(
        accountId: Long,
        adId: Long
) : VkMethod<RejectReason>(
    "ads.getRejectionReason",
    mutableMapOf(),
    object : TypeReference<VkResponse<RejectReason>>() {}
), UserMethod {

    var accountId: Long by props
    var adId: Long by props

    init {
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
}
