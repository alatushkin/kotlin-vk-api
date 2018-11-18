package name.alatushkin.api.vk.generated.market

import name.alatushkin.api.vk.api.VkDate
import name.alatushkin.api.vk.generated.common.Likes
import name.alatushkin.api.vk.generated.photos.Photo

open class MarketItemFull(
    val photos: Array<Photo>? = null,
    val canComment: Boolean? = null,
    val canRepost: Boolean? = null,
    val likes: Likes? = null,
    val viewsCount: Long? = null,
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