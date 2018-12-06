@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.messages.DeleteChatPhotoResponse
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var chatId: Long by props

    init {
        this.chatId = chatId
    }
}
