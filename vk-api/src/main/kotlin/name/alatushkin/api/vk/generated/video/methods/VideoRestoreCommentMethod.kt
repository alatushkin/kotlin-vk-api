package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Restores a previously deleted comment on a video.
 *
 *  [https://vk.com/dev/video.restoreComment]
 *  @property [owner_id] ID of the user or community that owns the video.
 *  @property [comment_id] ID of the deleted comment.
 */
class VideoRestoreCommentMethod() : VkMethod<Boolean>(
    "video.restoreComment",
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

    fun setOwnerId(ownerId: Long): VideoRestoreCommentMethod {
        this.ownerId = ownerId
        return this
    }

    fun setCommentId(commentId: Long): VideoRestoreCommentMethod {
        this.commentId = commentId
        return this
    }

    override val classRef = VideoRestoreCommentMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
