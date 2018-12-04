package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Edits the title of a chat.
 *
 *  [https://vk.com/dev/messages.editChat]
 *  @property [chat_id] Chat ID.
 *  @property [title] New title of the chat.
 */
class MessagesEditChatMethod() : VkMethod<Boolean>(
    "messages.editChat",
    HashMap()
) {

    var chatId: Long? by props
    var title: String? by props

    constructor(
        chatId: Long? = null,
        title: String? = null
    ) : this() {
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

    override val classRef = MessagesEditChatMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
