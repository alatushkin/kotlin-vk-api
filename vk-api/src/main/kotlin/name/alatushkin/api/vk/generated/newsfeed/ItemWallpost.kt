package name.alatushkin.api.vk.generated.newsfeed

import name.alatushkin.api.vk.api.VkDate
import name.alatushkin.api.vk.generated.common.CommentsInfo
import name.alatushkin.api.vk.generated.common.Geo
import name.alatushkin.api.vk.generated.common.LikesInfo
import name.alatushkin.api.vk.generated.common.RepostsInfo
import name.alatushkin.api.vk.generated.wall.PostSource
import name.alatushkin.api.vk.generated.wall.Wallpost
import name.alatushkin.api.vk.generated.wall.WallpostAttachment

open class ItemWallpost(
    val postId: Long? = null,
    val postType: ItemWallpostType? = null,
    val text: String? = null,
    val copyHistory: Array<Wallpost>? = null,
    val attachments: Array<WallpostAttachment>? = null,
    val geo: Geo? = null,
    val postSource: PostSource? = null,
    val comments: CommentsInfo? = null,
    val likes: LikesInfo? = null,
    val reposts: RepostsInfo? = null,
    override val type: NewsfeedItemType? = null,
    override val sourceId: Long? = null,
    override val date: VkDate? = null
) : NewsfeedItem
