@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.market.MarketItemFull
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/market.getById]
 *
 * Returns information about market items by their ids.
 *
 * @property itemIds Comma-separated ids list: {user id}_{item id}. If an item belongs to a community -{community id} is used. " 'Videos' value example: , '-4363_136089719,13245770_137352259'"
 */
class MarketGetByIdMethodExtended(
        itemIds: Array<String>
) : VkMethod<VkList<MarketItemFull>>(
    "market.getById",
    mutableMapOf("extended" to "1"),
    object : TypeReference<VkSuccess<VkList<MarketItemFull>>>() {}
), UserMethod {

    var itemIds: Array<String> by props

    init {
        this.itemIds = itemIds
    }

    fun setItemIds(itemIds: Array<String>): MarketGetByIdMethodExtended {
        this.itemIds = itemIds
        return this
    }
}
