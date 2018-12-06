package name.alatushkin.api.vk.generated.market

import name.alatushkin.api.vk.generated.messages.MessageAttachment
import name.alatushkin.api.vk.generated.photos.Photo
import name.alatushkin.api.vk.generated.wall.CommentAttachment
import name.alatushkin.api.vk.generated.wall.WallpostAttachment

open class MarketAlbum(
    val id: Long,
    val ownerId: Long,
    val title: String,
    val count: Long,
    val updatedTime: Long,
    val photo: Photo? = null
) : WallpostAttachment,
    CommentAttachment,
    MessageAttachment
