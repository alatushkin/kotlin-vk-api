package name.alatushkin.api.vk.generated.wall

import name.alatushkin.api.vk.api.VkDate
import name.alatushkin.api.vk.generated.common.LikesInfo
import name.alatushkin.api.vk.generated.messages.MessageAttachment

open class WallComment(
    val id: Long,
    val fromId: Long,
    val date: VkDate,
    val text: String,
    val likes: LikesInfo? = null,
    val replyToUser: Long? = null,
    val replyToComment: Long? = null,
    val attachments: Array<CommentAttachment>? = null,
    val realOffset: Long? = null
) : MessageAttachment
