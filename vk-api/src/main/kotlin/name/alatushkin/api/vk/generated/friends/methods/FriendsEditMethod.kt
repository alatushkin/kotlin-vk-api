@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.friends.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/friends.edit]
 *
 * Edits the friend lists of the selected user.
 *
 * @property userId ID of the user whose friend list is to be edited.
 * @property listIds IDs of the friend lists to which to add the user.
 */
class FriendsEditMethod(
    userId: Long,
    listIds: Array<Long>? = null
) : VkMethod<Boolean>(
    "friends.edit",
    mutableMapOf(),
    successReference()
), UserMethod {

    var userId: Long by props
    var listIds: Array<Long>? by props

    init {
        this.userId = userId
        this.listIds = listIds
    }
}
