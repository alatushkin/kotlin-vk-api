@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/messages.createChat]
 *
 * Creates a chat with several participants.
 *
 * @property userIds IDs of the users to be added to the chat.
 * @property title Chat title.
 */
class MessagesCreateChatMethod(
        userIds: Array<Long>,
        title: String? = null
) : VkMethod<Long>(
    "messages.createChat",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Long>>() {}
), UserMethod {

    var userIds: Array<Long> by props
    var title: String? by props

    init {
        this.userIds = userIds
        this.title = title
    }

    fun setUserIds(userIds: Array<Long>): MessagesCreateChatMethod {
        this.userIds = userIds
        return this
    }

    fun setTitle(title: String): MessagesCreateChatMethod {
        this.title = title
        return this
    }
}
