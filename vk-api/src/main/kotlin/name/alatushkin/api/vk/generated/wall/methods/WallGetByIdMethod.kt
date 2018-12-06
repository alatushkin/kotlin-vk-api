@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.wall.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.wall.WallpostFull
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserServiceMethod {

    var posts: Array<String> by props
    var copyHistoryDepth: Long? by props
    var fields: Array<String>? by props

    init {
        this.posts = posts
        this.copyHistoryDepth = copyHistoryDepth
        this.fields = fields
    }
}
