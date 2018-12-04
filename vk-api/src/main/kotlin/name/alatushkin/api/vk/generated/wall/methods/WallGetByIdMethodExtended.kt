package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.wall.GetByIdExtendedResponse

/**
 *  Returns a list of posts from user or community walls by their IDs.
 *
 *  [https://vk.com/dev/wall.getById]
 *  @property [posts] User or community IDs and post IDs, separated by underscores. Use a negative value to designate a community ID. Example: "93388_21539,93388_20904,2943_4276,-1_1"
 *  @property [copy_history_depth] Sets the number of parent elements to include in the array 'copy_history' that is returned if the post is a repost from another wall.
 *  @property [fields]
 */
class WallGetByIdMethodExtended() : VkMethod<GetByIdExtendedResponse>(
    "wall.getById",
    mutableMapOf("extended" to "1")
) {

    var posts: Array<String>? by props
    var copyHistoryDepth: Long? by props
    var fields: Array<String>? by props

    constructor(
        posts: Array<String>? = null,
        copyHistoryDepth: Long? = null,
        fields: Array<String>? = null
    ) : this() {
        this.posts = posts
        this.copyHistoryDepth = copyHistoryDepth
        this.fields = fields
    }

    fun setPosts(posts: Array<String>): WallGetByIdMethodExtended {
        this.posts = posts
        return this
    }

    fun setCopyHistoryDepth(copyHistoryDepth: Long): WallGetByIdMethodExtended {
        this.copyHistoryDepth = copyHistoryDepth
        return this
    }

    fun setFields(fields: Array<String>): WallGetByIdMethodExtended {
        this.fields = fields
        return this
    }

    override val classRef = WallGetByIdMethodExtended.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<GetByIdExtendedResponse>>() {}
    }
}
