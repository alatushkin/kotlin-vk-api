@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.account.Offer
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/account.getActiveOffers]
 *
 * Returns a list of active ads (offers) which executed by the user will bring him/her respective number of votes to his balance in the application.
 *
 * @property count Number of results to return.
 */
class AccountGetActiveOffersMethod(
    count: Long? = null
) : VkMethod<VkList<Offer>>(
    "account.getActiveOffers",
    mutableMapOf(),
    successReference()
), UserMethod {

    var count: Long? by props

    init {
        this.count = count
    }
}
