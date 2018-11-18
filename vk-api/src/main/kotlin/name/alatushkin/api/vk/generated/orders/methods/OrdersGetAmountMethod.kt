package name.alatushkin.api.vk.generated.orders.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.orders.Amount

/**
 *  null
 *
 *  [https://vk.com/dev/orders.getAmount]
 *  @property [user_id] null
 *  @property [votes] null
 */
class OrdersGetAmountMethod() : VkMethod<Amount>(
    "orders.getAmount",
    HashMap()
) {

    var userId: Long? by props
    var votes: Array<String>? by props

    constructor(
        userId: Long? = null,
        votes: Array<String>? = null
    ) : this() {
        this.userId = userId
        this.votes = votes
    }

    fun setUserId(userId: Long): OrdersGetAmountMethod {
        this.userId = userId
        return this
    }

    fun setVotes(votes: Array<String>): OrdersGetAmountMethod {
        this.votes = votes
        return this
    }

    override val classRef = OrdersGetAmountMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Amount>>() {}
    }
}
