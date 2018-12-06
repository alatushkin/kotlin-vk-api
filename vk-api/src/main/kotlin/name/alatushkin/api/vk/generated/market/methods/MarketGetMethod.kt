@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.market.MarketItem
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/market.get]
 *
 * Returns items list for a community.
 *
 * @property ownerId ID of an item owner community, "Note that community id in the 'owner_id' parameter should be negative number. For example 'owner_id'=-1 matches the [vk.com/apiclub|VK API] community "
 * @property count Number of items to return.
 * @property offset Offset needed to return a specific subset of results.
 */
class MarketGetMethod(
    ownerId: Long,
    count: Long? = null,
    offset: Long? = null
) : VkMethod<VkList<MarketItem>>(
    "market.get",
    mutableMapOf(),
    successReference()
), UserMethod {

    var ownerId: Long by props
    var count: Long? by props
    var offset: Long? by props

    init {
        this.ownerId = ownerId
        this.count = count
        this.offset = offset
    }
}
