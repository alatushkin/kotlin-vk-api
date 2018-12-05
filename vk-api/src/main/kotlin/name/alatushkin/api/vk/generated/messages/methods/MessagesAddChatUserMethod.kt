@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/messages.addChatUser]
 *
 * Adds a new user to a chat.
 *
 * @property chatId Chat ID.
 * @property userId ID of the user to be added to the chat.
 */
class MessagesAddChatUserMethod(
        chatId: Long,
        userId: Long
) : VkMethod<Boolean>(
    "messages.addChatUser",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var chatId: Long by props
    var userId: Long by props

    init {
        this.chatId = chatId
        this.userId = userId
    }

    fun setChatId(chatId: Long): MessagesAddChatUserMethod {
        this.chatId = chatId
        return this
    }

    fun setUserId(userId: Long): MessagesAddChatUserMethod {
        this.userId = userId
        return this
    }
}
