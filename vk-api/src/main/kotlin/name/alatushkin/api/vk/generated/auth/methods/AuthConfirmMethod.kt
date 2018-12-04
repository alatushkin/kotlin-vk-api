package name.alatushkin.api.vk.generated.auth.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.auth.ConfirmResponse

/**
 *  Completes a user's registration (begun with the [vk.com/dev/auth.signup|auth.signup] method) using an authorization code.
 *
 *  [https://vk.com/dev/auth.confirm]
 *  @property [client_id]
 *  @property [client_secret]
 *  @property [phone]
 *  @property [code]
 *  @property [password]
 *  @property [test_mode]
 *  @property [intro]
 */
class AuthConfirmMethod() : VkMethod<ConfirmResponse>(
    "auth.confirm",
    HashMap()
) {

    var clientId: Long? by props
    var clientSecret: String? by props
    var phone: String? by props
    var code: String? by props
    var password: String? by props
    var testMode: Boolean? by props
    var intro: Long? by props

    constructor(
        clientId: Long? = null,
        clientSecret: String? = null,
        phone: String? = null,
        code: String? = null,
        password: String? = null,
        testMode: Boolean? = null,
        intro: Long? = null
    ) : this() {
        this.clientId = clientId
        this.clientSecret = clientSecret
        this.phone = phone
        this.code = code
        this.password = password
        this.testMode = testMode
        this.intro = intro
    }

    fun setClientId(clientId: Long): AuthConfirmMethod {
        this.clientId = clientId
        return this
    }

    fun setClientSecret(clientSecret: String): AuthConfirmMethod {
        this.clientSecret = clientSecret
        return this
    }

    fun setPhone(phone: String): AuthConfirmMethod {
        this.phone = phone
        return this
    }

    fun setCode(code: String): AuthConfirmMethod {
        this.code = code
        return this
    }

    fun setPassword(password: String): AuthConfirmMethod {
        this.password = password
        return this
    }

    fun setTestMode(testMode: Boolean): AuthConfirmMethod {
        this.testMode = testMode
        return this
    }

    fun setIntro(intro: Long): AuthConfirmMethod {
        this.intro = intro
        return this
    }

    override val classRef = AuthConfirmMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<ConfirmResponse>>() {}
    }
}
