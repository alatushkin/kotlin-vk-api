package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Pins the post on wall.
 *
 *  [https://vk.com/dev/wall.pin]
 *  @property [owner_id] ID of the user or community that owns the wall. By default, current user ID. Use a negative value to designate a community ID.
 *  @property [post_id] Post ID.
 */
class WallPinMethod() : VkMethod<Boolean>(
    "wall.pin",
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

    fun setOwnerId(ownerId: Long): WallPinMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPostId(postId: Long): WallPinMethod {
        this.postId = postId
        return this
    }

    override val classRef = WallPinMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
