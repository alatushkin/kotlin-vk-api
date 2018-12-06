@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.wall.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/wall.restore]
 *
 * Restores a post deleted from a user wall or community wall.
 *
 * @property ownerId User ID or community ID from whose wall the post was deleted. Use a negative value to designate a community ID.
 * @property postId ID of the post to be restored.
 */
class WallRestoreMethod(
    ownerId: Long? = null,
    postId: Long? = null
) : VkMethod<Boolean>(
    "wall.restore",
    mutableMapOf(),
    successReference()
), UserMethod {

    var ownerId: Long? by props
    var postId: Long? by props

    init {
        this.ownerId = ownerId
        this.postId = postId
    }
}
