package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.wall.GetRepostsResponse

/**
 *  Returns information about reposts of a post on user wall or community wall.
 *
 *  [https://vk.com/dev/wall.getReposts]
 *  @property [owner_id] User ID or community ID. By default, current user ID. Use a negative value to designate a community ID.
 *  @property [post_id] Post ID.
 *  @property [offset] Offset needed to return a specific subset of reposts.
 *  @property [count] Number of reposts to return.
 */
class WallGetRepostsMethod() : VkMethod<GetRepostsResponse>(
    "wall.getReposts",
    HashMap()
) {

    var ownerId: Long? by props
    var postId: Long? by props
    var offset: Long? by props
    var count: Long? by props

    constructor(
        ownerId: Long? = null,
        postId: Long? = null,
        offset: Long? = null,
        count: Long? = null
    ) : this() {
        this.ownerId = ownerId
        this.postId = postId
        this.offset = offset
        this.count = count
    }

    fun setOwnerId(ownerId: Long): WallGetRepostsMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPostId(postId: Long): WallGetRepostsMethod {
        this.postId = postId
        return this
    }

    fun setOffset(offset: Long): WallGetRepostsMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): WallGetRepostsMethod {
        this.count = count
        return this
    }

    override val classRef = WallGetRepostsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<GetRepostsResponse>>() {}
    }
}
