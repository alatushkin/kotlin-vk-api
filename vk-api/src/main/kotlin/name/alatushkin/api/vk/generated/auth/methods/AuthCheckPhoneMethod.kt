@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.auth.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.ServiceMethod

/**
 * [https://vk.com/dev/auth.checkPhone]
 *
 * Checks a user's phone number for correctness.
 *
 * @property phone Phone number.
 * @property clientId User ID.
 * @property clientSecret 
 * @property authByPhone 
 */
class AuthCheckPhoneMethod(
        phone: String,
        clientId: Long? = null,
        clientSecret: String,
        authByPhone: Boolean? = null
) : VkMethod<Boolean>(
    "auth.checkPhone",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), ServiceMethod {

    var phone: String by props
    var clientId: Long? by props
    var clientSecret: String by props
    var authByPhone: Boolean? by props

    init {
        this.phone = phone
        this.clientId = clientId
        this.clientSecret = clientSecret
        this.authByPhone = authByPhone
    }

    fun setPhone(phone: String): AuthCheckPhoneMethod {
        this.phone = phone
        return this
    }

    fun setClientId(clientId: Long): AuthCheckPhoneMethod {
        this.clientId = clientId
        return this
    }

    fun setClientSecret(clientSecret: String): AuthCheckPhoneMethod {
        this.clientSecret = clientSecret
        return this
    }

    fun setAuthByPhone(authByPhone: Boolean): AuthCheckPhoneMethod {
        this.authByPhone = authByPhone
        return this
    }
}
