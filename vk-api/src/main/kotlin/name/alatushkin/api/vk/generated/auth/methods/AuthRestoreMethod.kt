package name.alatushkin.api.vk.generated.auth.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.auth.RestoreResponse

/**
 *  Allows to restore account access using a code received via SMS. " This method is only available for apps with [vk.com/dev/auth_direct|Direct authorization] access. "
 *
 *  [https://vk.com/dev/auth.restore]
 *  @property [phone] User phone number.
 *  @property [last_name] User last name.
 */
class AuthRestoreMethod() : VkMethod<RestoreResponse>(
    "auth.restore",
    HashMap()
) {

    var phone: String? by props
    var lastName: String? by props

    constructor(
        phone: String? = null,
        lastName: String? = null
    ) : this() {
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

    override val classRef = AuthRestoreMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<RestoreResponse>>() {}
    }
}
