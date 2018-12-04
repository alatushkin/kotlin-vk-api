package name.alatushkin.api.vk.generated.orders.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.orders.Order

/**
 *  Returns a list of orders.
 *
 *  [https://vk.com/dev/orders.get]
 *  @property [count] number of returned orders.
 *  @property [test_mode] if this parameter is set to 1, this method returns a list of test mode orders. By default — 0.
 */
class OrdersGetMethod() : VkMethod<Array<Order>>(
    "orders.get",
    HashMap()
) {

    var count: Long? by props
    var testMode: Boolean? by props

    constructor(
        count: Long? = null,
        testMode: Boolean? = null
    ) : this() {
        this.count = count
        this.testMode = testMode
    }

    fun setCount(count: Long): OrdersGetMethod {
        this.count = count
        return this
    }

    fun setTestMode(testMode: Boolean): OrdersGetMethod {
        this.testMode = testMode
        return this
    }

    override val classRef = OrdersGetMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Array<Order>>>() {}
    }
}
