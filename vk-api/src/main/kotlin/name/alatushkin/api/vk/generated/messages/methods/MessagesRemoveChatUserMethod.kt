package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Allows the current user to leave a chat or, if the current user started the chat, allows the user to remove another user from the chat.
 *
 *  [https://vk.com/dev/messages.removeChatUser]
 *  @property [chat_id] Chat ID.
 *  @property [user_id] ID of the user to be removed from the chat.
 */
class MessagesRemoveChatUserMethod() : VkMethod<Boolean>(
    "messages.removeChatUser",
    HashMap()
) {

    var chatId: Long? by props
    var userId: String? by props

    constructor(
        chatId: Long? = null,
        userId: String? = null
    ) : this() {
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

    override val classRef = MessagesRemoveChatUserMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
