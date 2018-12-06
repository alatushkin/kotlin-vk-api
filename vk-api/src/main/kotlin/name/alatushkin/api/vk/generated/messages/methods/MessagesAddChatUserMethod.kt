@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var chatId: Long by props
    var userId: Long by props

    init {
        this.chatId = chatId
        this.userId = userId
    }
}
