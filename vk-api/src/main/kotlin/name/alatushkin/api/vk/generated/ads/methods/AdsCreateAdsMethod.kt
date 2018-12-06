@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var accountId: Long by props
    var data: String by props

    init {
        this.accountId = accountId
        this.data = data
    }
}
