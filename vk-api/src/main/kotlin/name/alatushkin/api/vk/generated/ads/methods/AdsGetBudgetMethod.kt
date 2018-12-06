@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getBudget]
 *
 * Returns current budget of the advertising account.
 *
 * @property accountId Advertising account ID.
 */
class AdsGetBudgetMethod(
    accountId: Long
) : VkMethod<Long>(
    "ads.getBudget",
    mutableMapOf(),
    successReference()
), UserMethod {

    var accountId: Long by props

    init {
        this.accountId = accountId
    }
}
