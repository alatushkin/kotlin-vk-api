package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Deletes a comment on a video.
 *
 *  [https://vk.com/dev/video.deleteComment]
 *  @property [owner_id] ID of the user or community that owns the video.
 *  @property [comment_id] ID of the comment to be deleted.
 */
class VideoDeleteCommentMethod() : VkMethod<Boolean>(
    "video.deleteComment",
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

    fun setOwnerId(ownerId: Long): VideoDeleteCommentMethod {
        this.ownerId = ownerId
        return this
    }

    fun setCommentId(commentId: Long): VideoDeleteCommentMethod {
        this.commentId = commentId
        return this
    }

    override val classRef = VideoDeleteCommentMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
