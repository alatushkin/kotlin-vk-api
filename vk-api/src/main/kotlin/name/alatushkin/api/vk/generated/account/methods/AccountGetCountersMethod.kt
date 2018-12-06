@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.account.AccountCounters
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var filter: Array<String>? by props

    init {
        this.filter = filter
    }
}
