@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.auth.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.auth.RestoreResponse
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
    object : TypeReference<VkSuccess<RestoreResponse>>() {}
), ServiceMethod {

    var phone: String by props
    var lastName: String by props

    init {
        this.phone = phone
        this.lastName = lastName
    }

    fun setPhone(phone: String): AuthRestoreMethod {
        this.phone = phone
        return this
    }

    fun setLastName(lastName: String): AuthRestoreMethod {
        this.lastName = lastName
        return this
    }
}
