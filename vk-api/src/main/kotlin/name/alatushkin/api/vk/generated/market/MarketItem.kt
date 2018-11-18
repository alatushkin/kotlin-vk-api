package name.alatushkin.api.vk.generated.market

import name.alatushkin.api.vk.api.VkDate
import name.alatushkin.api.vk.generated.messages.MessageAttachment
import name.alatushkin.api.vk.generated.wall.CommentAttachment
import name.alatushkin.api.vk.generated.wall.WallpostAttachment

interface MarketItem : WallpostAttachment,
    CommentAttachment,
    MessageAttachment {
    val id: Long
    val ownerId: Long
    val title: String
    val description: String
    val price: Price
    val category: MarketCategory
    val date: VkDate
    val thumbPhoto: String
    val availability: MarketItemAvailability
}