package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.messages.Message

/**
 *  Returns messages by their IDs within the conversation.
 *
 *  [https://vk.com/dev/messages.getByConversationMessageId]
 *  @property [peer_id] Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
 *  @property [conversation_message_ids] Conversation message IDs.
 *  @property [extended] Information whether the response should be extended
 *  @property [fields] Profile fields to return.
 *  @property [group_id] Group ID (for group messages with group access token)
 */
class MessagesGetByConversationMessageIdMethod() : VkMethod<VkList<Message>>(
    "messages.getByConversationMessageId",
    HashMap()
) {

    var peerId: Long? by props
    var conversationMessageIds: Array<Long>? by props
    var extended: Boolean? by props
    var fields: Array<String>? by props
    var groupId: Long? by props

    constructor(
        peerId: Long? = null,
        conversationMessageIds: Array<Long>? = null,
        extended: Boolean? = null,
        fields: Array<String>? = null,
        groupId: Long? = null
    ) : this() {
        this.peerId = peerId
        this.conversationMessageIds = conversationMessageIds
        this.extended = extended
        this.fields = fields
        this.groupId = groupId
    }

    fun setPeerId(peerId: Long): MessagesGetByConversationMessageIdMethod {
        this.peerId = peerId
        return this
    }

    fun setConversationMessageIds(conversationMessageIds: Array<Long>): MessagesGetByConversationMessageIdMethod {
        this.conversationMessageIds = conversationMessageIds
        return this
    }

    fun setExtended(extended: Boolean): MessagesGetByConversationMessageIdMethod {
        this.extended = extended
        return this
    }

    fun setFields(fields: Array<String>): MessagesGetByConversationMessageIdMethod {
        this.fields = fields
        return this
    }

    fun setGroupId(groupId: Long): MessagesGetByConversationMessageIdMethod {
        this.groupId = groupId
        return this
    }

    override val classRef = MessagesGetByConversationMessageIdMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<Message>>>() {}
    }
}
