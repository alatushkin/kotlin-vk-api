@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/messages.removeChatUser]
 *
 * Allows the current user to leave a chat or, if the current user started the chat, allows the user to remove another user from the chat.
 *
 * @property chatId Chat ID.
 * @property userId ID of the user to be removed from the chat.
 */
class MessagesRemoveChatUserMethod(
        chatId: Long,
        userId: String
) : VkMethod<Boolean>(
    "messages.removeChatUser",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserMethod {

    var chatId: Long by props
    var userId: String by props

    init {
        this.chatId = chatId
        this.userId = userId
    }

    fun setChatId(chatId: Long): MessagesRemoveChatUserMethod {
        this.chatId = chatId
        return this
    }

    fun setUserId(userId: String): MessagesRemoveChatUserMethod {
        this.userId = userId
        return this
    }
}
