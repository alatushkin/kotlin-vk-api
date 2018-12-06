@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.wall.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var ownerId: Long? by props
    var commentId: Long by props

    init {
        this.ownerId = ownerId
        this.commentId = commentId
    }
}
