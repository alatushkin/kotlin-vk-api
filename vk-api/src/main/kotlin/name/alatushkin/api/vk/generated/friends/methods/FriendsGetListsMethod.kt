@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.friends.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.friends.FriendsList
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/friends.getLists]
 *
 * Returns a list of the user's friend lists.
 *
 * @property userId User ID.
 * @property returnSystem '1' — to return system friend lists. By default: '0'.
 */
class FriendsGetListsMethod(
    userId: Long? = null,
    returnSystem: Boolean? = null
) : VkMethod<VkList<FriendsList>>(
    "friends.getLists",
    mutableMapOf(),
    successReference()
), UserMethod {

    var userId: Long? by props
    var returnSystem: Boolean? by props

    init {
        this.userId = userId
        this.returnSystem = returnSystem
    }
}
