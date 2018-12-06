@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.secure.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
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
    successReference()
), ServiceMethod {

    var counters: Array<String>? by props
    var userId: Long? by props
    var counter: Long? by props

    init {
        this.counters = counters
        this.userId = userId
        this.counter = counter
    }
}
