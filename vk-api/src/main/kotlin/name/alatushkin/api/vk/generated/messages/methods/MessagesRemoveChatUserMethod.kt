@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var chatId: Long by props
    var userId: String by props

    init {
        this.chatId = chatId
        this.userId = userId
    }
}
