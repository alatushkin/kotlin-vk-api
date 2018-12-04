@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/video.deleteComment]
 *
 * Deletes a comment on a video.
 *
 * @property ownerId ID of the user or community that owns the video.
 * @property commentId ID of the comment to be deleted.
 */
class VideoDeleteCommentMethod(
        ownerId: Long? = null,
        commentId: Long
) : VkMethod<Boolean>(
    "video.deleteComment",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserMethod {

    var ownerId: Long? by props
    var commentId: Long by props

    init {
        this.ownerId = ownerId
        this.commentId = commentId
    }

    fun setOwnerId(ownerId: Long): VideoDeleteCommentMethod {
        this.ownerId = ownerId
        return this
    }

    fun setCommentId(commentId: Long): VideoDeleteCommentMethod {
        this.commentId = commentId
        return this
    }
}
