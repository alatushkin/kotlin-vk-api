package name.alatushkin.api.vk.generated.fave.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.wall.WallpostFull

/**
 *  Returns a list of wall posts that the current user has liked.
 *
 *  [https://vk.com/dev/fave.getPosts]
 *  @property [offset] Offset needed to return a specific subset of posts.
 *  @property [count] Number of posts to return.
 *  @property [extended] '1' — to return additional 'wall', 'profiles', and 'groups' fields. By default: '0'.
 */
class FaveGetPostsMethod() : VkMethod<VkList<WallpostFull>>(
    "fave.getPosts",
    HashMap()
) {

    var offset: Long? by props
    var count: Long? by props
    var extended: Boolean? by props

    constructor(
        offset: Long? = null,
        count: Long? = null,
        extended: Boolean? = null
    ) : this() {
        this.offset = offset
        this.count = count
        this.extended = extended
    }

    fun setOffset(offset: Long): FaveGetPostsMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): FaveGetPostsMethod {
        this.count = count
        return this
    }

    fun setExtended(extended: Boolean): FaveGetPostsMethod {
        this.extended = extended
        return this
    }

    override val classRef = FaveGetPostsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<WallpostFull>>>() {}
    }
}
