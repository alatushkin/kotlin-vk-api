@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
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
    object : TypeReference<VkSuccess<Long>>() {}
), UserMethod {

    var userId: Long by props

    init {
        this.userId = userId
    }

    fun setUserId(userId: Long): AccountGetAppPermissionsMethod {
        this.userId = userId
        return this
    }
}
