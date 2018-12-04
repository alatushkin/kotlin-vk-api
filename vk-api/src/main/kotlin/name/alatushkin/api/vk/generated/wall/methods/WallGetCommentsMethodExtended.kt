package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.common.Sort
import name.alatushkin.api.vk.generated.wall.GetCommentsExtendedResponse

/**
 *  Returns a list of comments on a post on a user wall or community wall.
 *
 *  [https://vk.com/dev/wall.getComments]
 *  @property [owner_id] User ID or community ID. Use a negative value to designate a community ID.
 *  @property [post_id] Post ID.
 *  @property [need_likes] '1' — to return the 'likes' field, '0' — not to return the 'likes' field (default)
 *  @property [start_comment_id]
 *  @property [offset] Offset needed to return a specific subset of comments.
 *  @property [count] Number of comments to return (maximum 100).
 *  @property [sort] Sort order: 'asc' — chronological, 'desc' — reverse chronological
 *  @property [preview_length] Number of characters at which to truncate comments when previewed. By default, '90'. Specify '0' if you do not want to truncate comments.
 */
class WallGetCommentsMethodExtended() : VkMethod<GetCommentsExtendedResponse>(
    "wall.getComments",
    mutableMapOf("extended" to "1")
) {

    var ownerId: Long? by props
    var postId: Long? by props
    var needLikes: Boolean? by props
    var startCommentId: Long? by props
    var offset: Long? by props
    var count: Long? by props
    var sort: Sort? by props
    var previewLength: Long? by props

    constructor(
        ownerId: Long? = null,
        postId: Long? = null,
        needLikes: Boolean? = null,
        startCommentId: Long? = null,
        offset: Long? = null,
        count: Long? = null,
        sort: Sort? = null,
        previewLength: Long? = null
    ) : this() {
        this.ownerId = ownerId
        this.postId = postId
        this.needLikes = needLikes
        this.startCommentId = startCommentId
        this.offset = offset
        this.count = count
        this.sort = sort
        this.previewLength = previewLength
    }

    fun setOwnerId(ownerId: Long): WallGetCommentsMethodExtended {
        this.ownerId = ownerId
        return this
    }

    fun setPostId(postId: Long): WallGetCommentsMethodExtended {
        this.postId = postId
        return this
    }

    fun setNeedLikes(needLikes: Boolean): WallGetCommentsMethodExtended {
        this.needLikes = needLikes
        return this
    }

    fun setStartCommentId(startCommentId: Long): WallGetCommentsMethodExtended {
        this.startCommentId = startCommentId
        return this
    }

    fun setOffset(offset: Long): WallGetCommentsMethodExtended {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): WallGetCommentsMethodExtended {
        this.count = count
        return this
    }

    fun setSort(sort: Sort): WallGetCommentsMethodExtended {
        this.sort = sort
        return this
    }

    fun setPreviewLength(previewLength: Long): WallGetCommentsMethodExtended {
        this.previewLength = previewLength
        return this
    }

    override val classRef = WallGetCommentsMethodExtended.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<GetCommentsExtendedResponse>>() {}
    }
}
