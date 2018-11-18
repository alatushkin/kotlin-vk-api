package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Restores a comment deleted from a user wall or community wall.
 *
 *  [https://vk.com/dev/wall.restoreComment]
 *  @property [owner_id] User ID or community ID. Use a negative value to designate a community ID.
 *  @property [comment_id] Comment ID.
 */
class WallRestoreCommentMethod() : VkMethod<Boolean>(
    "wall.restoreComment",
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

    fun setOwnerId(ownerId: Long): WallRestoreCommentMethod {
        this.ownerId = ownerId
        return this
    }

    fun setCommentId(commentId: Long): WallRestoreCommentMethod {
        this.commentId = commentId
        return this
    }

    override val classRef = WallRestoreCommentMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
