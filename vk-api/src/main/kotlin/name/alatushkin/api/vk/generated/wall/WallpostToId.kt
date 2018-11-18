package name.alatushkin.api.vk.generated.wall

import name.alatushkin.api.vk.api.VkDate
import name.alatushkin.api.vk.generated.common.CommentsInfo
import name.alatushkin.api.vk.generated.common.Geo
import name.alatushkin.api.vk.generated.common.LikesInfo
import name.alatushkin.api.vk.generated.common.RepostsInfo
import name.alatushkin.api.vk.generated.notifications.NotificationParent

open class WallpostToId(
    val id: Long? = null,
    val fromId: Long? = null,
    val toId: Long? = null,
    val date: VkDate? = null,
    val postId: Long? = null,
    val postType: PostType? = null,
    val text: String? = null,
    val signerId: Long? = null,
    val attachments: Array<WallpostAttachment>? = null,
    val geo: Geo? = null,
    val postSource: PostSource? = null,
    val comments: CommentsInfo? = null,
    val likes: LikesInfo? = null,
    val reposts: RepostsInfo? = null,
    val copyOwnerId: Long? = null,
    val copyPostId: Long? = null
) : NotificationParent