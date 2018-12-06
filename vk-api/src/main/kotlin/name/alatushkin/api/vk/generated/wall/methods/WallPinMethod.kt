@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.wall.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var ownerId: Long? by props
    var postId: Long by props

    init {
        this.ownerId = ownerId
        this.postId = postId
    }
}
