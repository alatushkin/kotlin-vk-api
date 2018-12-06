@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.friends.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/friends.getRecent]
 *
 * Returns a list of user IDs of the current user's recently added friends.
 *
 * @property count Number of recently added friends to return.
 */
class FriendsGetRecentMethod(
    count: Long? = null
) : VkMethod<Array<Long>>(
    "friends.getRecent",
    mutableMapOf(),
    successReference()
), UserMethod {

    var count: Long? by props

    init {
        this.count = count
    }
}
