@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.auth.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.auth.RestoreResponse
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.ServiceMethod

/**
 * [https://vk.com/dev/auth.restore]
 *
 * Allows to restore account access using a code received via SMS. " This method is only available for apps with [vk.com/dev/auth_direct|Direct authorization] access. "
 *
 * @property phone User phone number.
 * @property lastName User last name.
 */
class AuthRestoreMethod(
    phone: String,
    lastName: String
) : VkMethod<RestoreResponse>(
    "auth.restore",
    mutableMapOf(),
    successReference()
), ServiceMethod {

    var phone: String by props
    var lastName: String by props

    init {
        this.phone = phone
        this.lastName = lastName
    }
}
