@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.orders.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.orders.Amount
import name.alatushkin.api.vk.successReference

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
    successReference()
) {

    var userId: Long by props
    var votes: Array<String> by props

    init {
        this.userId = userId
        this.votes = votes
    }
}
