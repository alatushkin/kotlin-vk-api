@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/messages.editChat]
 *
 * Edits the title of a chat.
 *
 * @property chatId Chat ID.
 * @property title New title of the chat.
 */
class MessagesEditChatMethod(
    chatId: Long,
    title: String
) : VkMethod<Boolean>(
    "messages.editChat",
    mutableMapOf(),
    successReference()
), UserMethod {

    var chatId: Long by props
    var title: String by props

    init {
        this.chatId = chatId
        this.title = title
    }
}
