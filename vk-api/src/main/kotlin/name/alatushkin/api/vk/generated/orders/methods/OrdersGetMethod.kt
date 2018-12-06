@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.orders.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.orders.Order
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/orders.get]
 *
 * Returns a list of orders.
 *
 * @property count number of returned orders.
 * @property testMode if this parameter is set to 1, this method returns a list of test mode orders. By default — 0.
 */
class OrdersGetMethod(
    count: Long? = null,
    testMode: Boolean? = null
) : VkMethod<Array<Order>>(
    "orders.get",
    mutableMapOf(),
    successReference()
), UserMethod {

    var count: Long? by props
    var testMode: Boolean? by props

    init {
        this.count = count
        this.testMode = testMode
    }
}
