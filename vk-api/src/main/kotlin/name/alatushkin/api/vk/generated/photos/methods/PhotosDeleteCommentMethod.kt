@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var ownerId: Long? by props
    var commentId: Long by props

    init {
        this.ownerId = ownerId
        this.commentId = commentId
    }
}
