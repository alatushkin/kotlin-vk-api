package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Restores a deleted comment on a photo.
 *
 *  [https://vk.com/dev/photos.restoreComment]
 *  @property [owner_id] ID of the user or community that owns the photo.
 *  @property [comment_id] ID of the deleted comment.
 */
class PhotosRestoreCommentMethod() : VkMethod<Boolean>(
    "photos.restoreComment",
    HashMap()
) {

    var ownerId: Long? by props
    var commentId: Long? by props

    constructor(
        ownerId: Long? = null,
        commentId: Long? = null
    ) : this() {
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

    override val classRef = PhotosRestoreCommentMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
