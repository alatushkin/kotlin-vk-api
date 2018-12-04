@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.friends.AddListResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/friends.addList]
 *
 * Creates a new friend list for the current user.
 *
 * @property name Name of the friend list.
 * @property userIds IDs of users to be added to the friend list.
 */
class FriendsAddListMethod(
        name: String,
        userIds: Array<Long>? = null
) : VkMethod<AddListResponse>(
    "friends.addList",
    mutableMapOf(),
    object : TypeReference<VkSuccess<AddListResponse>>() {}
), UserMethod {

    var name: String by props
    var userIds: Array<Long>? by props

    init {
        this.name = name
        this.userIds = userIds
    }

    fun setName(name: String): FriendsAddListMethod {
        this.name = name
        return this
    }

    fun setUserIds(userIds: Array<Long>): FriendsAddListMethod {
        this.userIds = userIds
        return this
    }
}
