@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.account.ChangePasswordResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/account.changePassword]
 *
 * Changes a user password after access is successfully restored with the [vk.com/dev/auth.restore|auth.restore] method.
 *
 * @property restoreSid Session id received after the [vk.com/dev/auth.restore|auth.restore] method is executed. (If the password is changed right after the access was restored)
 * @property changePasswordHash Hash received after a successful OAuth authorization with a code got by SMS. (If the password is changed right after the access was restored)
 * @property oldPassword Current user password.
 * @property newPassword New password that will be set as a current
 */
class AccountChangePasswordMethod(
        restoreSid: String? = null,
        changePasswordHash: String? = null,
        oldPassword: String? = null,
        newPassword: String
) : VkMethod<ChangePasswordResponse>(
    "account.changePassword",
    mutableMapOf(),
    object : TypeReference<VkSuccess<ChangePasswordResponse>>() {}
), UserMethod {

    var restoreSid: String? by props
    var changePasswordHash: String? by props
    var oldPassword: String? by props
    var newPassword: String by props

    init {
        this.restoreSid = restoreSid
        this.changePasswordHash = changePasswordHash
        this.oldPassword = oldPassword
        this.newPassword = newPassword
    }

    fun setRestoreSid(restoreSid: String): AccountChangePasswordMethod {
        this.restoreSid = restoreSid
        return this
    }

    fun setChangePasswordHash(changePasswordHash: String): AccountChangePasswordMethod {
        this.changePasswordHash = changePasswordHash
        return this
    }

    fun setOldPassword(oldPassword: String): AccountChangePasswordMethod {
        this.oldPassword = oldPassword
        return this
    }

    fun setNewPassword(newPassword: String): AccountChangePasswordMethod {
        this.newPassword = newPassword
        return this
    }
}
