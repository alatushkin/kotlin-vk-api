@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/account.banUser]
 *
 * Adds user to the banlist.
 *
 * @property userId User ID.
 */
class AccountBanUserMethod(
    userId: Long
) : VkMethod<Boolean>(
    "account.banUser",
    mutableMapOf(),
    successReference()
), UserMethod {

    var userId: Long by props

    init {
        this.userId = userId
    }
}
