@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.wall.WallpostFull
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/wall.getById]
 *
 * Returns a list of posts from user or community walls by their IDs.
 *
 * @property posts User or community IDs and post IDs, separated by underscores. Use a negative value to designate a community ID. Example: "93388_21539,93388_20904,2943_4276,-1_1"
 * @property copyHistoryDepth Sets the number of parent elements to include in the array 'copy_history' that is returned if the post is a repost from another wall.
 * @property fields 
 */
class WallGetByIdMethod(
        posts: Array<String>,
        copyHistoryDepth: Long? = null,
        fields: Array<String>? = null
) : VkMethod<Array<WallpostFull>>(
    "wall.getById",
    mutableMapOf(),
    object : TypeReference<VkResponse<Array<WallpostFull>>>() {}
), UserServiceMethod {

    var posts: Array<String> by props
    var copyHistoryDepth: Long? by props
    var fields: Array<String>? by props

    init {
        this.posts = posts
        this.copyHistoryDepth = copyHistoryDepth
        this.fields = fields
    }

    fun setPosts(posts: Array<String>): WallGetByIdMethod {
        this.posts = posts
        return this
    }

    fun setCopyHistoryDepth(copyHistoryDepth: Long): WallGetByIdMethod {
        this.copyHistoryDepth = copyHistoryDepth
        return this
    }

    fun setFields(fields: Array<String>): WallGetByIdMethod {
        this.fields = fields
        return this
    }
}
