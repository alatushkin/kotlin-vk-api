@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.ads.Client
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
    object : TypeReference<VkResponse<Array<Client>>>() {}
), UserMethod {

    var accountId: Long by props

    init {
        this.accountId = accountId
    }

    fun setAccountId(accountId: Long): AdsGetClientsMethod {
        this.accountId = accountId
        return this
    }
}
