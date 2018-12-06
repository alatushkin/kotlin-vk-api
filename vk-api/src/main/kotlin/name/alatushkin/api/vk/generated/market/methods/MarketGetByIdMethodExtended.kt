@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.market.MarketItemFull
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var itemIds: Array<String> by props

    init {
        this.itemIds = itemIds
    }
}
