package name.alatushkin.api.vk.generated.market

import name.alatushkin.api.vk.api.VkDate

open class MarketItemImpl(
    override val id: Long,
    override val ownerId: Long,
    override val title: String,
    override val description: String,
    override val price: Price,
    override val category: MarketCategory,
    override val date: VkDate,
    override val thumbPhoto: String,
    override val availability: MarketItemAvailability
) : MarketItem
