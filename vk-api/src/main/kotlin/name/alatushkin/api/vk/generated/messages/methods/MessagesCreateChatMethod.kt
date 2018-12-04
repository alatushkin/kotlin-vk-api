package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Creates a chat with several participants.
 *
 *  [https://vk.com/dev/messages.createChat]
 *  @property [user_ids] IDs of the users to be added to the chat.
 *  @property [title] Chat title.
 */
class MessagesCreateChatMethod() : VkMethod<Long>(
    "messages.createChat",
    HashMap()
) {

    var userIds: Array<Long>? by props
    var title: String? by props

    constructor(
        userIds: Array<Long>? = null,
        title: String? = null
    ) : this() {
        this.userIds = userIds
        this.title = title
    }

    fun setUserIds(userIds: Array<Long>): MessagesCreateChatMethod {
        this.userIds = userIds
        return this
    }

    fun setTitle(title: String): MessagesCreateChatMethod {
        this.title = title
        return this
    }

    override val classRef = MessagesCreateChatMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Long>>() {}
    }
}
