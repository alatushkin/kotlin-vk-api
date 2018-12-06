@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var ownerId: Long? by props
    var commentId: Long by props

    init {
        this.ownerId = ownerId
        this.commentId = commentId
    }
}
