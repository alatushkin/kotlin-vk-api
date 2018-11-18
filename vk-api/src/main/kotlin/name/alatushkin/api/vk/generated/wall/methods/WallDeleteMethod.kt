package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Deletes a post from a user wall or community wall.
 *
 *  [https://vk.com/dev/wall.delete]
 *  @property [owner_id] User ID or community ID. Use a negative value to designate a community ID.
 *  @property [post_id] ID of the post to be deleted.
 */
class WallDeleteMethod() : VkMethod<Boolean>(
    "wall.delete",
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

    fun setOwnerId(ownerId: Long): WallDeleteMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPostId(postId: Long): WallDeleteMethod {
        this.postId = postId
        return this
    }

    override val classRef = WallDeleteMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
