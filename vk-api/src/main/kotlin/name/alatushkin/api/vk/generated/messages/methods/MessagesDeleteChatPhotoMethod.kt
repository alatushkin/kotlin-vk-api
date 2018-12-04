@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.messages.DeleteChatPhotoResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/messages.deleteChatPhoto]
 *
 * Deletes a chat's cover picture.
 *
 * @property chatId Chat ID.
 */
class MessagesDeleteChatPhotoMethod(
        chatId: Long
) : VkMethod<DeleteChatPhotoResponse>(
    "messages.deleteChatPhoto",
    mutableMapOf(),
    object : TypeReference<VkSuccess<DeleteChatPhotoResponse>>() {}
), UserMethod {

    var chatId: Long by props

    init {
        this.chatId = chatId
    }

    fun setChatId(chatId: Long): MessagesDeleteChatPhotoMethod {
        this.chatId = chatId
        return this
    }
}
