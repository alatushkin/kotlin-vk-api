@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.messages.ConversationWithMessage
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/messages.getConversationsById]
 *
 * Returns conversations by their IDs
 *
 * @property peerIds Destination IDs. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
 * @property extended Return extended properties
 * @property fields Profile and communities fields to return.
 * @property groupId Group ID (for group messages with group access token)
 */
class MessagesGetConversationsByIdMethod(
        peerIds: Array<Long>,
        extended: Boolean? = null,
        fields: Array<String>? = null,
        groupId: Long? = null
) : VkMethod<VkList<ConversationWithMessage>>(
    "messages.getConversationsById",
    mutableMapOf(),
    object : TypeReference<VkResponse<VkList<ConversationWithMessage>>>() {}
), UserGroupMethod {

    var peerIds: Array<Long> by props
    var extended: Boolean? by props
    var fields: Array<String>? by props
    var groupId: Long? by props

    init {
        this.peerIds = peerIds
        this.extended = extended
        this.fields = fields
        this.groupId = groupId
    }

    fun setPeerIds(peerIds: Array<Long>): MessagesGetConversationsByIdMethod {
        this.peerIds = peerIds
        return this
    }

    fun setExtended(extended: Boolean): MessagesGetConversationsByIdMethod {
        this.extended = extended
        return this
    }

    fun setFields(fields: Array<String>): MessagesGetConversationsByIdMethod {
        this.fields = fields
        return this
    }

    fun setGroupId(groupId: Long): MessagesGetConversationsByIdMethod {
        this.groupId = groupId
        return this
    }
}
