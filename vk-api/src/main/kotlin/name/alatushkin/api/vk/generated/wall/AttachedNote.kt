package name.alatushkin.api.vk.generated.wall

import name.alatushkin.api.vk.api.VkDate

open class AttachedNote(
    val id: Long,
    val ownerId: Long,
    val comments: Long,
    val readComments: Long,
    val date: VkDate,
    val title: String,
    val viewUrl: String
) : WallpostAttachment,
    CommentAttachment
