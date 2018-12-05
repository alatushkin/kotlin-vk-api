@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
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
    object : TypeReference<VkResponse<Array<Long>>>() {}
), UserMethod {

    var count: Long? by props

    init {
        this.count = count
    }

    fun setCount(count: Long): FriendsGetRecentMethod {
        this.count = count
        return this
    }
}
