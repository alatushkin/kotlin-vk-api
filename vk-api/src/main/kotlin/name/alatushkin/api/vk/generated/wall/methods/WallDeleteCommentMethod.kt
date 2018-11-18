package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Deletes a comment on a post on a user wall or community wall.
 *
 *  [https://vk.com/dev/wall.deleteComment]
 *  @property [owner_id] User ID or community ID. Use a negative value to designate a community ID.
 *  @property [comment_id] Comment ID.
 */
class WallDeleteCommentMethod() : VkMethod<Boolean>(
    "wall.deleteComment",
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

    fun setOwnerId(ownerId: Long): WallDeleteCommentMethod {
        this.ownerId = ownerId
        return this
    }

    fun setCommentId(commentId: Long): WallDeleteCommentMethod {
        this.commentId = commentId
        return this
    }

    override val classRef = WallDeleteCommentMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
