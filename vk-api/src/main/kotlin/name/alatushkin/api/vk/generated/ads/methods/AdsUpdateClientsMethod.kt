@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.updateClients]
 *
 * Edits clients of an advertising agency.
 *
 * @property accountId Advertising account ID.
 * @property data Serialized JSON array of objects that describe changes in clients. Description of 'client_mod' objects see below.
 */
class AdsUpdateClientsMethod(
        accountId: Long,
        data: String
) : VkMethod<Long>(
    "ads.updateClients",
    mutableMapOf(),
    object : TypeReference<VkResponse<Long>>() {}
), UserMethod {

    var accountId: Long by props
    var data: String by props

    init {
        this.accountId = accountId
        this.data = data
    }

    fun setAccountId(accountId: Long): AdsUpdateClientsMethod {
        this.accountId = accountId
        return this
    }

    fun setData(data: String): AdsUpdateClientsMethod {
        this.data = data
        return this
    }
}
