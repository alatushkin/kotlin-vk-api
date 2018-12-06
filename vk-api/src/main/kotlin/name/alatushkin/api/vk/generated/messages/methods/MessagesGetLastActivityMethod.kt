@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.messages.LastActivity
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/messages.getLastActivity]
 *
 * Returns a user's current status and date of last activity.
 *
 * @property userId User ID.
 */
class MessagesGetLastActivityMethod(
    userId: Long
) : VkMethod<LastActivity>(
    "messages.getLastActivity",
    mutableMapOf(),
    successReference()
), UserMethod {

    var userId: Long by props

    init {
        this.userId = userId
    }
}
