@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/messages.deleteConversation]
 *
 * Deletes all private messages in a conversation.
 *
 * @property userId User ID. To clear a chat history use 'chat_id'
 * @property groupId Group ID (for group messages with user access token)
 * @property peerId Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
 * @property offset Offset needed to delete a specific subset of conversations.
 * @property count Number of conversations to delete. "NOTE: If the number of messages exceeds the maximum, the method shall be called several times."
 */
class MessagesDeleteConversationMethod(
        userId: String? = null,
        groupId: Long? = null,
        peerId: Long? = null,
        offset: Long? = null,
        count: Long? = null
) : VkMethod<Boolean>(
    "messages.deleteConversation",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserGroupMethod {

    var userId: String? by props
    var groupId: Long? by props
    var peerId: Long? by props
    var offset: Long? by props
    var count: Long? by props

    init {
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
}
