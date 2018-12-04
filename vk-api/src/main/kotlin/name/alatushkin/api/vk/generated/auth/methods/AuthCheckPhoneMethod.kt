package name.alatushkin.api.vk.generated.auth.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Checks a user's phone number for correctness.
 *
 *  [https://vk.com/dev/auth.checkPhone]
 *  @property [phone] Phone number.
 *  @property [client_id] User ID.
 *  @property [client_secret]
 *  @property [auth_by_phone]
 */
class AuthCheckPhoneMethod() : VkMethod<Boolean>(
    "auth.checkPhone",
    HashMap()
) {

    var phone: String? by props
    var clientId: Long? by props
    var clientSecret: String? by props
    var authByPhone: Boolean? by props

    constructor(
        phone: String? = null,
        clientId: Long? = null,
        clientSecret: String? = null,
        authByPhone: Boolean? = null
    ) : this() {
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

    override val classRef = AuthCheckPhoneMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
