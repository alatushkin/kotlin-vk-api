@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/wall.pin]
 *
 * Pins the post on wall.
 *
 * @property ownerId ID of the user or community that owns the wall. By default, current user ID. Use a negative value to designate a community ID.
 * @property postId Post ID.
 */
class WallPinMethod(
        ownerId: Long? = null,
        postId: Long
) : VkMethod<Boolean>(
    "wall.pin",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserMethod {

    var ownerId: Long? by props
    var postId: Long by props

    init {
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
}
