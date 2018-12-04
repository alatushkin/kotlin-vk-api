@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/friends.deleteList]
 *
 * Deletes a friend list of the current user.
 *
 * @property listId ID of the friend list to delete.
 */
class FriendsDeleteListMethod(
        listId: Long
) : VkMethod<Boolean>(
    "friends.deleteList",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserMethod {

    var listId: Long by props

    init {
        this.listId = listId
    }

    fun setListId(listId: Long): FriendsDeleteListMethod {
        this.listId = listId
        return this
    }
}
