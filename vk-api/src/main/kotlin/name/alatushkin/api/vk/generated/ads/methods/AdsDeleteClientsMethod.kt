@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.deleteClients]
 *
 * Archives clients of an advertising agency.
 *
 * @property accountId Advertising account ID.
 * @property ids Serialized JSON array with IDs of deleted clients.
 */
class AdsDeleteClientsMethod(
    accountId: Long,
    ids: String
) : VkMethod<Long>(
    "ads.deleteClients",
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
