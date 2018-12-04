@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.auth.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.auth.ConfirmResponse
import name.alatushkin.api.vk.tokens.ServiceMethod

/**
 * [https://vk.com/dev/auth.confirm]
 *
 * Completes a user's registration (begun with the [vk.com/dev/auth.signup|auth.signup] method) using an authorization code.
 *
 * @property clientId 
 * @property clientSecret 
 * @property phone 
 * @property code 
 * @property password 
 * @property testMode 
 * @property intro 
 */
class AuthConfirmMethod(
        clientId: Long,
        clientSecret: String,
        phone: String,
        code: String,
        password: String? = null,
        testMode: Boolean? = null,
        intro: Long? = null
) : VkMethod<ConfirmResponse>(
    "auth.confirm",
    mutableMapOf(),
    object : TypeReference<VkSuccess<ConfirmResponse>>() {}
), ServiceMethod {

    var clientId: Long by props
    var clientSecret: String by props
    var phone: String by props
    var code: String by props
    var password: String? by props
    var testMode: Boolean? by props
    var intro: Long? by props

    init {
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
}
