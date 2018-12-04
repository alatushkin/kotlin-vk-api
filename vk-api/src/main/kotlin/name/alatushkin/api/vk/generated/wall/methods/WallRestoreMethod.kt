package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Restores a post deleted from a user wall or community wall.
 *
 *  [https://vk.com/dev/wall.restore]
 *  @property [owner_id] User ID or community ID from whose wall the post was deleted. Use a negative value to designate a community ID.
 *  @property [post_id] ID of the post to be restored.
 */
class WallRestoreMethod() : VkMethod<Boolean>(
    "wall.restore",
    HashMap()
) {

    var ownerId: Long? by props
    var postId: Long? by props

    constructor(
        ownerId: Long? = null,
        postId: Long? = null
    ) : this() {
        this.ownerId = ownerId
        this.postId = postId
    }

    fun setOwnerId(ownerId: Long): WallRestoreMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPostId(postId: Long): WallRestoreMethod {
        this.postId = postId
        return this
    }

    override val classRef = WallRestoreMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
