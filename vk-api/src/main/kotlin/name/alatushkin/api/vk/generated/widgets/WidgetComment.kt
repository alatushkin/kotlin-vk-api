package name.alatushkin.api.vk.generated.widgets

import name.alatushkin.api.vk.api.VkDate
import name.alatushkin.api.vk.generated.common.LikesInfo
import name.alatushkin.api.vk.generated.common.RepostsInfo
import name.alatushkin.api.vk.generated.users.UserFull
import name.alatushkin.api.vk.generated.wall.CommentAttachment
import name.alatushkin.api.vk.generated.wall.PostSource

open class WidgetComment(
    val id: Long,
    val fromId: Long,
    val toId: Long,
    val date: VkDate,
    val user: UserFull? = null,
    val postType: Long,
    val text: String,
    val canDelete: Boolean? = null,
    val media: CommentMedia? = null,
    val attachments: Array<CommentAttachment>? = null,
    val postSource: PostSource? = null,
    val comments: CommentReplies? = null,
    val likes: LikesInfo? = null,
    val reposts: RepostsInfo? = null
)