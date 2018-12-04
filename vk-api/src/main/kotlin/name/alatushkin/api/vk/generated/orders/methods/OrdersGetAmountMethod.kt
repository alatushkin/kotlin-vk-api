@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.orders.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.orders.Amount

/**
 * [https://vk.com/dev/orders.getAmount]
 *
 * null
 *
 * @property userId 
 * @property votes 
 */
class OrdersGetAmountMethod(
        userId: Long,
        votes: Array<String>
) : VkMethod<Amount>(
    "orders.getAmount",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Amount>>() {}
) {

    var userId: Long by props
    var votes: Array<String> by props

    init {
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
}
