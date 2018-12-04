@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.market.MarketItemFull
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
class MarketGetMethodExtended(
        ownerId: Long,
        count: Long? = null,
        offset: Long? = null
) : VkMethod<VkList<MarketItemFull>>(
    "market.get",
    mutableMapOf("extended" to "1"),
    object : TypeReference<VkSuccess<VkList<MarketItemFull>>>() {}
), UserMethod {

    var ownerId: Long by props
    var count: Long? by props
    var offset: Long? by props

    init {
        this.ownerId = ownerId
        this.count = count
        this.offset = offset
    }

    fun setOwnerId(ownerId: Long): MarketGetMethodExtended {
        this.ownerId = ownerId
        return this
    }

    fun setCount(count: Long): MarketGetMethodExtended {
        this.count = count
        return this
    }

    fun setOffset(offset: Long): MarketGetMethodExtended {
        this.offset = offset
        return this
    }
}
