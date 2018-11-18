package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Adds a new user to a chat.
 *
 *  [https://vk.com/dev/messages.addChatUser]
 *  @property [chat_id] Chat ID.
 *  @property [user_id] ID of the user to be added to the chat.
 */
class MessagesAddChatUserMethod() : VkMethod<Boolean>(
    "messages.addChatUser",
    HashMap()
) {

    var chatId: Long? by props
    var userId: Long? by props

    constructor(
        chatId: Long? = null,
        userId: Long? = null
    ) : this() {
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

    override val classRef = MessagesAddChatUserMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
