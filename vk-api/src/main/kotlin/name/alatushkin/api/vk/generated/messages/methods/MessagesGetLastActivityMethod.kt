@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.messages.LastActivity
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
    object : TypeReference<VkResponse<LastActivity>>() {}
), UserMethod {

    var userId: Long by props

    init {
        this.userId = userId
    }

    fun setUserId(userId: Long): MessagesGetLastActivityMethod {
        this.userId = userId
        return this
    }
}
