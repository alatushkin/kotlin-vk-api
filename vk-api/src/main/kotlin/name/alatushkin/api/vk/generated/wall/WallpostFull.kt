package name.alatushkin.api.vk.generated.wall

import name.alatushkin.api.vk.api.VkDate
import name.alatushkin.api.vk.generated.common.CommentsInfo
import name.alatushkin.api.vk.generated.common.Geo
import name.alatushkin.api.vk.generated.common.LikesInfo
import name.alatushkin.api.vk.generated.common.RepostsInfo

open class WallpostFull(
    val copyHistory: Array<Wallpost>? = null,
    val canEdit: Boolean? = null,
    val createdBy: Long? = null,
    val canDelete: Boolean? = null,
    val canPin: Boolean? = null,
    val isPinned: Long? = null,
    val comments: CommentsInfo? = null,
    val likes: LikesInfo? = null,
    val reposts: RepostsInfo? = null,
    val markedAsAds: Boolean? = null,
    override val id: Long? = null,
    override val fromId: Long? = null,
    override val ownerId: Long? = null,
    override val date: VkDate? = null,
    override val views: Views? = null,
    override val accessKey: String? = null,
    override val postType: PostType? = null,
    override val text: String? = null,
    override val signerId: Long? = null,
    override val attachments: Array<WallpostAttachment>? = null,
    override val geo: Geo? = null,
    override val postSource: PostSource? = null
) : Wallpost