@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.friends.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.friends.DeleteResponse
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/friends.delete]
 *
 * Declines a friend request or deletes a user from the current user's friend list.
 *
 * @property userId ID of the user whose friend request is to be declined or who is to be deleted from the current user's friend list.
 */
class FriendsDeleteMethod(
    userId: Long
) : VkMethod<DeleteResponse>(
    "friends.delete",
    mutableMapOf(),
    successReference()
), UserMethod {

    var userId: Long by props

    init {
        this.userId = userId
    }
}
