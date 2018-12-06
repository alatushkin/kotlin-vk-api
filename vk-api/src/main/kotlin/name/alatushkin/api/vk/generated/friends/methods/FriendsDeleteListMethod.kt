@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.friends.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var listId: Long by props

    init {
        this.listId = listId
    }
}
