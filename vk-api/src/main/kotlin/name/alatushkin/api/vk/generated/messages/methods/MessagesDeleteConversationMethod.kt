package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Deletes all private messages in a conversation.
 *
 *  [https://vk.com/dev/messages.deleteConversation]
 *  @property [user_id] User ID. To clear a chat history use 'chat_id'
 *  @property [group_id] Group ID (for group messages with user access token)
 *  @property [peer_id] Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
 *  @property [offset] Offset needed to delete a specific subset of conversations.
 *  @property [count] Number of conversations to delete. "NOTE: If the number of messages exceeds the maximum, the method shall be called several times."
 */
class MessagesDeleteConversationMethod() : VkMethod<Boolean>(
    "messages.deleteConversation",
    HashMap()
) {

    var userId: String? by props
    var groupId: Long? by props
    var peerId: Long? by props
    var offset: Long? by props
    var count: Long? by props

    constructor(
        userId: String? = null,
        groupId: Long? = null,
        peerId: Long? = null,
        offset: Long? = null,
        count: Long? = null
    ) : this() {
        this.userId = userId
        this.groupId = groupId
        this.peerId = peerId
        this.offset = offset
        this.count = count
    }

    fun setUserId(userId: String): MessagesDeleteConversationMethod {
        this.userId = userId
        return this
    }

    fun setGroupId(groupId: Long): MessagesDeleteConversationMethod {
        this.groupId = groupId
        return this
    }

    fun setPeerId(peerId: Long): MessagesDeleteConversationMethod {
        this.peerId = peerId
        return this
    }

    fun setOffset(offset: Long): MessagesDeleteConversationMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): MessagesDeleteConversationMethod {
        this.count = count
        return this
    }

    override val classRef = MessagesDeleteConversationMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
