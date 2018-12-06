@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/account.unbanUser]
 *
 * Deletes user from the blacklist.
 *
 * @property userId User ID.
 */
class AccountUnbanUserMethod(
    userId: Long
) : VkMethod<Boolean>(
    "account.unbanUser",
    mutableMapOf(),
    successReference()
), UserMethod {

    var userId: Long by props

    init {
        this.userId = userId
    }
}
