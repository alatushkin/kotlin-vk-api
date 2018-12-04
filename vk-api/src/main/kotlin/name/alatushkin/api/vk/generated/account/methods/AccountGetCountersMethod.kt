@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.account.AccountCounters
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/account.getCounters]
 *
 * Returns non-null values of user counters.
 *
 * @property filter Counters to be returned.
 */
class AccountGetCountersMethod(
        filter: Array<String>? = null
) : VkMethod<AccountCounters>(
    "account.getCounters",
    mutableMapOf(),
    object : TypeReference<VkSuccess<AccountCounters>>() {}
), UserMethod {

    var filter: Array<String>? by props

    init {
        this.filter = filter
    }

    fun setFilter(filter: Array<String>): AccountGetCountersMethod {
        this.filter = filter
        return this
    }
}
