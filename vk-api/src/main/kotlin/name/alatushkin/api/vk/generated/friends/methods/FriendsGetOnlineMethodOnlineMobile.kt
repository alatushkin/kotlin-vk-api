@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.friends.GetOnlineOnlineMobileResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/friends.getOnline]
 *
 * Returns a list of user IDs of a user's friends who are online.
 *
 * @property userId User ID.
 * @property listId Friend list ID. If this parameter is not set, information about all online friends is returned.
 * @property order Sort order: 'random' — random order
 * @property count Number of friends to return.
 * @property offset Offset needed to return a specific subset of friends.
 */
class FriendsGetOnlineMethodOnlineMobile(
        userId: Long? = null,
        listId: Long? = null,
        order: String? = null,
        count: Long? = null,
        offset: Long? = null
) : VkMethod<GetOnlineOnlineMobileResponse>(
    "friends.getOnline",
    mutableMapOf("online_mobile" to "1"),
    object : TypeReference<VkSuccess<GetOnlineOnlineMobileResponse>>() {}
), UserMethod {

    var userId: Long? by props
    var listId: Long? by props
    var order: String? by props
    var count: Long? by props
    var offset: Long? by props

    init {
        this.userId = userId
        this.listId = listId
        this.order = order
        this.count = count
        this.offset = offset
    }

    fun setUserId(userId: Long): FriendsGetOnlineMethodOnlineMobile {
        this.userId = userId
        return this
    }

    fun setListId(listId: Long): FriendsGetOnlineMethodOnlineMobile {
        this.listId = listId
        return this
    }

    fun setOrder(order: String): FriendsGetOnlineMethodOnlineMobile {
        this.order = order
        return this
    }

    fun setCount(count: Long): FriendsGetOnlineMethodOnlineMobile {
        this.count = count
        return this
    }

    fun setOffset(offset: Long): FriendsGetOnlineMethodOnlineMobile {
        this.offset = offset
        return this
    }
}
