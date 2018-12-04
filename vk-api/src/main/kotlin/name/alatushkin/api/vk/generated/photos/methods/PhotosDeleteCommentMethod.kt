@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.deleteComment]
 *
 * Deletes a comment on the photo.
 *
 * @property ownerId ID of the user or community that owns the photo.
 * @property commentId Comment ID.
 */
class PhotosDeleteCommentMethod(
        ownerId: Long? = null,
        commentId: Long
) : VkMethod<Boolean>(
    "photos.deleteComment",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserMethod {

    var ownerId: Long? by props
    var commentId: Long by props

    init {
        this.ownerId = ownerId
        this.commentId = commentId
    }

    fun setOwnerId(ownerId: Long): PhotosDeleteCommentMethod {
        this.ownerId = ownerId
        return this
    }

    fun setCommentId(commentId: Long): PhotosDeleteCommentMethod {
        this.commentId = commentId
        return this
    }
}
