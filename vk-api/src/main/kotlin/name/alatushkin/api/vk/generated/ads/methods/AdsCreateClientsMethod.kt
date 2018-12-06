@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.createClients]
 *
 * Creates clients of an advertising agency.
 *
 * @property accountId Advertising account ID.
 * @property data Serialized JSON array of objects that describe created campaigns. Description of 'client_specification' objects see below.
 */
class AdsCreateClientsMethod(
    accountId: Long,
    data: String
) : VkMethod<Array<Long>>(
    "ads.createClients",
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
