@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/messages.markAsRead]
 *
 * Marks messages as read.
 *
 * @property messageIds IDs of messages to mark as read.
 * @property peerId Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
 * @property startMessageId Message ID to start from.
 * @property groupId Group ID (for group messages with user access token)
 */
class MessagesMarkAsReadMethod(
        messageIds: Array<Long>? = null,
        peerId: Long? = null,
        startMessageId: Long? = null,
        groupId: Long? = null
) : VkMethod<Boolean>(
    "messages.markAsRead",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserGroupMethod {

    var messageIds: Array<Long>? by props
    var peerId: Long? by props
    var startMessageId: Long? by props
    var groupId: Long? by props

    init {
        this.messageIds = messageIds
        this.peerId = peerId
        this.startMessageId = startMessageId
        this.groupId = groupId
    }

    fun setMessageIds(messageIds: Array<Long>): MessagesMarkAsReadMethod {
        this.messageIds = messageIds
        return this
    }

    fun setPeerId(peerId: Long): MessagesMarkAsReadMethod {
        this.peerId = peerId
        return this
    }

    fun setStartMessageId(startMessageId: Long): MessagesMarkAsReadMethod {
        this.startMessageId = startMessageId
        return this
    }

    fun setGroupId(groupId: Long): MessagesMarkAsReadMethod {
        this.groupId = groupId
        return this
    }
}
