package name.alatushkin.api.vk.generated.stats.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.stats.WallpostStat

/**
 *  Returns stats for a wall post.
 *
 *  [https://vk.com/dev/stats.getPostReach]
 *  @property [owner_id] post owner community id. Specify with "-" sign.
 *  @property [post_id] wall post id. Note that stats are available only for '300' last (newest) posts on a community wall.
 */
class StatsGetPostReachMethod() : VkMethod<Array<WallpostStat>>(
    "stats.getPostReach",
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

    fun setOwnerId(ownerId: Long): StatsGetPostReachMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPostId(postId: Long): StatsGetPostReachMethod {
        this.postId = postId
        return this
    }

    override val classRef = StatsGetPostReachMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Array<WallpostStat>>>() {}
    }
}
