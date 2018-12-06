@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.ads.Client
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getClients]
 *
 * Returns a list of advertising agency's clients.
 *
 * @property accountId Advertising account ID.
 */
class AdsGetClientsMethod(
    accountId: Long
) : VkMethod<Array<Client>>(
    "ads.getClients",
    mutableMapOf(),
    successReference()
), UserMethod {

    var accountId: Long by props

    init {
        this.accountId = accountId
    }
}
