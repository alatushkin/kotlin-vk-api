package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Deletes a comment on the photo.
 *
 *  [https://vk.com/dev/photos.deleteComment]
 *  @property [owner_id] ID of the user or community that owns the photo.
 *  @property [comment_id] Comment ID.
 */
class PhotosDeleteCommentMethod() : VkMethod<Boolean>(
    "photos.deleteComment",
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

    fun setOwnerId(ownerId: Long): PhotosDeleteCommentMethod {
        this.ownerId = ownerId
        return this
    }

    fun setCommentId(commentId: Long): PhotosDeleteCommentMethod {
        this.commentId = commentId
        return this
    }

    override val classRef = PhotosDeleteCommentMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
