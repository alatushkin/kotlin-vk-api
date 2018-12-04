package name.alatushkin.api.vk.generated.orders.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.orders.Order

/**
 *  Returns information about orders by their IDs.
 *
 *  [https://vk.com/dev/orders.getById]
 *  @property [order_id] order ID.
 *  @property [order_ids] order IDs (when information about several orders is requested).
 *  @property [test_mode] if this parameter is set to 1, this method returns a list of test mode orders. By default — 0.
 */
class OrdersGetByIdMethod() : VkMethod<Array<Order>>(
    "orders.getById",
    HashMap()
) {

    var orderId: Long? by props
    var orderIds: Array<Long>? by props
    var testMode: Boolean? by props

    constructor(
        orderId: Long? = null,
        orderIds: Array<Long>? = null,
        testMode: Boolean? = null
    ) : this() {
        this.orderId = orderId
        this.orderIds = orderIds
        this.testMode = testMode
    }

    fun setOrderId(orderId: Long): OrdersGetByIdMethod {
        this.orderId = orderId
        return this
    }

    fun setOrderIds(orderIds: Array<Long>): OrdersGetByIdMethod {
        this.orderIds = orderIds
        return this
    }

    fun setTestMode(testMode: Boolean): OrdersGetByIdMethod {
        this.testMode = testMode
        return this
    }

    override val classRef = OrdersGetByIdMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Array<Order>>>() {}
    }
}
