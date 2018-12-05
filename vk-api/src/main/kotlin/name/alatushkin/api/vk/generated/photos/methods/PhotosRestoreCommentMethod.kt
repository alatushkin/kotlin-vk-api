@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.restoreComment]
 *
 * Restores a deleted comment on a photo.
 *
 * @property ownerId ID of the user or community that owns the photo.
 * @property commentId ID of the deleted comment.
 */
class PhotosRestoreCommentMethod(
        ownerId: Long? = null,
        commentId: Long
) : VkMethod<Boolean>(
    "photos.restoreComment",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var ownerId: Long? by props
    var commentId: Long by props

    init {
        this.ownerId = ownerId
        this.commentId = commentId
    }

    fun setOwnerId(ownerId: Long): PhotosRestoreCommentMethod {
        this.ownerId = ownerId
        return this
    }

    fun setCommentId(commentId: Long): PhotosRestoreCommentMethod {
        this.commentId = commentId
        return this
    }
}
