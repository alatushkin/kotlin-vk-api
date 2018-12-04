package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.messages.DeleteChatPhotoResponse

/**
 *  Deletes a chat's cover picture.
 *
 *  [https://vk.com/dev/messages.deleteChatPhoto]
 *  @property [chat_id] Chat ID.
 */
class MessagesDeleteChatPhotoMethod() : VkMethod<DeleteChatPhotoResponse>(
    "messages.deleteChatPhoto",
    HashMap()
) {

    var chatId: Long? by props

    constructor(
        chatId: Long? = null
    ) : this() {
        this.chatId = chatId
    }

    fun setChatId(chatId: Long): MessagesDeleteChatPhotoMethod {
        this.chatId = chatId
        return this
    }

    override val classRef = MessagesDeleteChatPhotoMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<DeleteChatPhotoResponse>>() {}
    }
}
