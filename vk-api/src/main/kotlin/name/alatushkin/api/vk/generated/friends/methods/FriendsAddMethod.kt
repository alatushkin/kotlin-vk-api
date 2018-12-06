@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.friends.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.friends.responses.AddResponseResponse
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/friends.add]
 *
 * Approves or creates a friend request.
 *
 * @property userId ID of the user whose friend request will be approved or to whom a friend request will be sent.
 * @property text Text of the message (up to 500 characters) for the friend request, if any.
 * @property follow '1' to pass an incoming request to followers list.
 */
class FriendsAddMethod(
    userId: Long,
    text: String? = null,
    follow: Boolean? = null
) : VkMethod<AddResponseResponse>(
    "friends.add",
    mutableMapOf(),
    successReference()
), UserMethod {

    var userId: Long by props
    var text: String? by props
    var follow: Boolean? by props

    init {
        this.userId = userId
        this.text = text
        this.follow = follow
    }
}
