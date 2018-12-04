@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/wall.deleteComment]
 *
 * Deletes a comment on a post on a user wall or community wall.
 *
 * @property ownerId User ID or community ID. Use a negative value to designate a community ID.
 * @property commentId Comment ID.
 */
class WallDeleteCommentMethod(
        ownerId: Long? = null,
        commentId: Long
) : VkMethod<Boolean>(
    "wall.deleteComment",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserMethod {

    var ownerId: Long? by props
    var commentId: Long by props

    init {
        this.ownerId = ownerId
        this.commentId = commentId
    }

    fun setOwnerId(ownerId: Long): WallDeleteCommentMethod {
        this.ownerId = ownerId
        return this
    }

    fun setCommentId(commentId: Long): WallDeleteCommentMethod {
        this.commentId = commentId
        return this
    }
}
