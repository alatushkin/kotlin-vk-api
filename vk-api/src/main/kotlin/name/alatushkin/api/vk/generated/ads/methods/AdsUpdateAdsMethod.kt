@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.updateAds]
 *
 * Edits ads.
 *
 * @property accountId Advertising account ID.
 * @property data Serialized JSON array of objects that describe changes in ads. Description of 'ad_edit_specification' objects see below.
 */
class AdsUpdateAdsMethod(
        accountId: Long,
        data: String
) : VkMethod<Array<Long>>(
    "ads.updateAds",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Array<Long>>>() {}
), UserMethod {

    var accountId: Long by props
    var data: String by props

    init {
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
}
