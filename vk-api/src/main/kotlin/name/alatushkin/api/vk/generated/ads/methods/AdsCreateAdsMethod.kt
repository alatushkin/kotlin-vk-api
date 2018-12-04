@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.createAds]
 *
 * Creates ads.
 *
 * @property accountId Advertising account ID.
 * @property data Serialized JSON array of objects that describe created ads. Description of 'ad_specification' objects see below.
 */
class AdsCreateAdsMethod(
        accountId: Long,
        data: String
) : VkMethod<Array<Long>>(
    "ads.createAds",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Array<Long>>>() {}
), UserMethod {

    var accountId: Long by props
    var data: String by props

    init {
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
}
