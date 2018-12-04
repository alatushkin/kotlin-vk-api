@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.secure.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.secure.TokenChecked
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/secure.checkToken]
 *
 * Checks the user authentication in 'IFrame' and 'Flash' apps using the 'access_token' parameter.
 *
 * @property token client 'access_token'
 * @property ip user 'ip address'. Note that user may access using the 'ipv6' address, in this case it is required to transmit the 'ipv6' address. If not transmitted, the address will not be checked.
 */
class SecureCheckTokenMethod(
        token: String? = null,
        ip: String? = null
) : VkMethod<TokenChecked>(
    "secure.checkToken",
    mutableMapOf(),
    object : TypeReference<VkSuccess<TokenChecked>>() {}
), UserMethod {

    var token: String? by props
    var ip: String? by props

    init {
        this.token = token
        this.ip = ip
    }

    fun setToken(token: String): SecureCheckTokenMethod {
        this.token = token
        return this
    }

    fun setIp(ip: String): SecureCheckTokenMethod {
        this.ip = ip
        return this
    }
}
