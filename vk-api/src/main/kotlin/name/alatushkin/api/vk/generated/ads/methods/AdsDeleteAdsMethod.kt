@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.deleteAds]
 *
 * Archives ads.
 *
 * @property accountId Advertising account ID.
 * @property ids Serialized JSON array with ad IDs.
 */
class AdsDeleteAdsMethod(
    accountId: Long,
    ids: String
) : VkMethod<Array<Long>>(
    "ads.deleteAds",
    mutableMapOf(),
    successReference()
), UserMethod {

    var accountId: Long by props
    var ids: String by props

    init {
        this.accountId = accountId
        this.ids = ids
    }
}
