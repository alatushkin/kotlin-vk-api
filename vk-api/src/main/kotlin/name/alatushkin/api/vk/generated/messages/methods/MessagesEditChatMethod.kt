@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
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
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var chatId: Long by props
    var title: String by props

    init {
        this.chatId = chatId
        this.title = title
    }

    fun setChatId(chatId: Long): MessagesEditChatMethod {
        this.chatId = chatId
        return this
    }

    fun setTitle(title: String): MessagesEditChatMethod {
        this.title = title
        return this
    }
}
