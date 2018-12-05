@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
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
    object : TypeReference<VkResponse<Long>>() {}
), UserMethod {

    var accountId: Long by props

    init {
        this.accountId = accountId
    }

    fun setAccountId(accountId: Long): AdsGetBudgetMethod {
        this.accountId = accountId
        return this
    }
}
