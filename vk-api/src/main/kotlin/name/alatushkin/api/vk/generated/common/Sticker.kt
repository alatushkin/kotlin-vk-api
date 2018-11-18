package name.alatushkin.api.vk.generated.common

import name.alatushkin.api.vk.generated.messages.MessageAttachment
import name.alatushkin.api.vk.generated.wall.CommentAttachment

open class Sticker(
    val stickerId: Long? = null,
    val productId: Long? = null,
    val images: Array<Image>? = null,
    val imagesWithBackground: Array<Image>? = null
) : CommentAttachment,
    MessageAttachment