@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.messages.Message
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/messages.getByConversationMessageId]
 *
 * Returns messages by their IDs within the conversation.
 *
 * @property peerId Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
 * @property conversationMessageIds Conversation message IDs.
 * @property extended Information whether the response should be extended
 * @property fields Profile fields to return.
 * @property groupId Group ID (for group messages with group access token)
 */
class MessagesGetByConversationMessageIdMethod(
        peerId: Long? = null,
        conversationMessageIds: Array<Long>,
        extended: Boolean? = null,
        fields: Array<String>? = null,
        groupId: Long? = null
) : VkMethod<VkList<Message>>(
    "messages.getByConversationMessageId",
    mutableMapOf(),
    object : TypeReference<VkResponse<VkList<Message>>>() {}
), UserGroupMethod {

    var peerId: Long? by props
    var conversationMessageIds: Array<Long> by props
    var extended: Boolean? by props
    var fields: Array<String>? by props
    var groupId: Long? by props

    init {
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
}
