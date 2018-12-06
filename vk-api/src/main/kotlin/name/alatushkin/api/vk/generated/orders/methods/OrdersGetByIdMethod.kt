@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.orders.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.orders.Order
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/orders.getById]
 *
 * Returns information about orders by their IDs.
 *
 * @property orderId order ID.
 * @property orderIds order IDs (when information about several orders is requested).
 * @property testMode if this parameter is set to 1, this method returns a list of test mode orders. By default — 0.
 */
class OrdersGetByIdMethod(
    orderId: Long? = null,
    orderIds: Array<Long>? = null,
    testMode: Boolean? = null
) : VkMethod<Array<Order>>(
    "orders.getById",
    mutableMapOf(),
    successReference()
), UserMethod {

    var orderId: Long? by props
    var orderIds: Array<Long>? by props
    var testMode: Boolean? by props

    init {
        this.orderId = orderId
        this.orderIds = orderIds
        this.testMode = testMode
    }
}
