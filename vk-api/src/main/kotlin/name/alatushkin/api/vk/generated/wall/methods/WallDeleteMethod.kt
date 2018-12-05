@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/wall.delete]
 *
 * Deletes a post from a user wall or community wall.
 *
 * @property ownerId User ID or community ID. Use a negative value to designate a community ID.
 * @property postId ID of the post to be deleted.
 */
class WallDeleteMethod(
        ownerId: Long? = null,
        postId: Long? = null
) : VkMethod<Boolean>(
    "wall.delete",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var ownerId: Long? by props
    var postId: Long? by props

    init {
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
}
