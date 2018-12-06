@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.wall.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.wall.GetRepostsResponse
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/wall.getReposts]
 *
 * Returns information about reposts of a post on user wall or community wall.
 *
 * @property ownerId User ID or community ID. By default, current user ID. Use a negative value to designate a community ID.
 * @property postId Post ID.
 * @property offset Offset needed to return a specific subset of reposts.
 * @property count Number of reposts to return.
 */
class WallGetRepostsMethod(
    ownerId: Long? = null,
    postId: Long? = null,
    offset: Long? = null,
    count: Long? = null
) : VkMethod<GetRepostsResponse>(
    "wall.getReposts",
    mutableMapOf(),
    successReference()
), UserServiceMethod {

    var ownerId: Long? by props
    var postId: Long? by props
    var offset: Long? by props
    var count: Long? by props

    init {
        this.ownerId = ownerId
        this.postId = postId
        this.offset = offset
        this.count = count
    }
}
