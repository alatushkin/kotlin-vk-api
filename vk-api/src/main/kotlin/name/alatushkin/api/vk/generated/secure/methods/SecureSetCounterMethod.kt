@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.secure.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.ServiceMethod

/**
 * [https://vk.com/dev/secure.setCounter]
 *
 * Sets a counter which is shown to the user in bold in the left menu.
 *
 * @property counters 
 * @property userId 
 * @property counter counter value.
 */
class SecureSetCounterMethod(
        counters: Array<String>? = null,
        userId: Long? = null,
        counter: Long? = null
) : VkMethod<Boolean>(
    "secure.setCounter",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), ServiceMethod {

    var counters: Array<String>? by props
    var userId: Long? by props
    var counter: Long? by props

    init {
        this.counters = counters
        this.userId = userId
        this.counter = counter
    }

    fun setCounters(counters: Array<String>): SecureSetCounterMethod {
        this.counters = counters
        return this
    }

    fun setUserId(userId: Long): SecureSetCounterMethod {
        this.userId = userId
        return this
    }

    fun setCounter(counter: Long): SecureSetCounterMethod {
        this.counter = counter
        return this
    }
}
