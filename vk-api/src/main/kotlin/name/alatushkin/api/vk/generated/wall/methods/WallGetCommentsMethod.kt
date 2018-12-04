@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.common.Sort
import name.alatushkin.api.vk.generated.wall.WallComment
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/wall.getComments]
 *
 * Returns a list of comments on a post on a user wall or community wall.
 *
 * @property ownerId User ID or community ID. Use a negative value to designate a community ID.
 * @property postId Post ID.
 * @property needLikes '1' — to return the 'likes' field, '0' — not to return the 'likes' field (default)
 * @property startCommentId 
 * @property offset Offset needed to return a specific subset of comments.
 * @property count Number of comments to return (maximum 100).
 * @property sort Sort order: 'asc' — chronological, 'desc' — reverse chronological
 * @property previewLength Number of characters at which to truncate comments when previewed. By default, '90'. Specify '0' if you do not want to truncate comments.
 */
class WallGetCommentsMethod(
        ownerId: Long? = null,
        postId: Long,
        needLikes: Boolean? = null,
        startCommentId: Long? = null,
        offset: Long? = null,
        count: Long? = null,
        sort: Sort? = null,
        previewLength: Long? = null
) : VkMethod<VkList<WallComment>>(
    "wall.getComments",
    mutableMapOf(),
    object : TypeReference<VkSuccess<VkList<WallComment>>>() {}
), UserServiceMethod {

    var ownerId: Long? by props
    var postId: Long by props
    var needLikes: Boolean? by props
    var startCommentId: Long? by props
    var offset: Long? by props
    var count: Long? by props
    var sort: Sort? by props
    var previewLength: Long? by props

    init {
        this.ownerId = ownerId
        this.postId = postId
        this.needLikes = needLikes
        this.startCommentId = startCommentId
        this.offset = offset
        this.count = count
        this.sort = sort
        this.previewLength = previewLength
    }

    fun setOwnerId(ownerId: Long): WallGetCommentsMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPostId(postId: Long): WallGetCommentsMethod {
        this.postId = postId
        return this
    }

    fun setNeedLikes(needLikes: Boolean): WallGetCommentsMethod {
        this.needLikes = needLikes
        return this
    }

    fun setStartCommentId(startCommentId: Long): WallGetCommentsMethod {
        this.startCommentId = startCommentId
        return this
    }

    fun setOffset(offset: Long): WallGetCommentsMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): WallGetCommentsMethod {
        this.count = count
        return this
    }

    fun setSort(sort: Sort): WallGetCommentsMethod {
        this.sort = sort
        return this
    }

    fun setPreviewLength(previewLength: Long): WallGetCommentsMethod {
        this.previewLength = previewLength
        return this
    }
}
