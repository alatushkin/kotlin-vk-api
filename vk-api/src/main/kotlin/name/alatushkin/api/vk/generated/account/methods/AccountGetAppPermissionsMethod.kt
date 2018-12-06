@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/account.getAppPermissions]
 *
 * Gets settings of the user in this application.
 *
 * @property userId User ID whose settings information shall be got. By default: current user.
 */
class AccountGetAppPermissionsMethod(
    userId: Long
) : VkMethod<Long>(
    "account.getAppPermissions",
    mutableMapOf(),
    successReference()
), UserMethod {

    var userId: Long by props

    init {
        this.userId = userId
    }
}
