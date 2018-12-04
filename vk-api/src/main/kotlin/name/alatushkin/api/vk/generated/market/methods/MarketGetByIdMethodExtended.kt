package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.market.MarketItemFull

/**
 *  Returns information about market items by their ids.
 *
 *  [https://vk.com/dev/market.getById]
 *  @property [item_ids] Comma-separated ids list: {user id}_{item id}. If an item belongs to a community -{community id} is used. " 'Videos' value example: , '-4363_136089719,13245770_137352259'"
 */
class MarketGetByIdMethodExtended() : VkMethod<VkList<MarketItemFull>>(
    "market.getById",
    mutableMapOf("extended" to "1")
) {

    var itemIds: Array<String>? by props

    constructor(
        itemIds: Array<String>? = null
    ) : this() {
        this.itemIds = itemIds
    }

    fun setItemIds(itemIds: Array<String>): MarketGetByIdMethodExtended {
        this.itemIds = itemIds
        return this
    }

    override val classRef = MarketGetByIdMethodExtended.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<VkList<MarketItemFull>>>() {}
    }
}
