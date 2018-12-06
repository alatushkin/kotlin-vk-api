package name.alatushkin.api.vk.generated.board

import name.alatushkin.api.vk.api.VkDate
import name.alatushkin.api.vk.generated.wall.CommentAttachment

open class TopicComment(
    val id: Long,
    val fromId: Long,
    val date: VkDate,
    val text: String,
    val attachments: Array<CommentAttachment>? = null,
    val realOffset: Long? = null
)
