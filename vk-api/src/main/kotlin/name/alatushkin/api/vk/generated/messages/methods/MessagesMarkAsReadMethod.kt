package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Marks messages as read.
 *
 *  [https://vk.com/dev/messages.markAsRead]
 *  @property [message_ids] IDs of messages to mark as read.
 *  @property [peer_id] Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
 *  @property [start_message_id] Message ID to start from.
 *  @property [group_id] Group ID (for group messages with user access token)
 */
class MessagesMarkAsReadMethod() : VkMethod<Boolean>(
    "messages.markAsRead",
    HashMap()
) {

    var messageIds: Array<Long>? by props
    var peerId: Long? by props
    var startMessageId: Long? by props
    var groupId: Long? by props

    constructor(
        messageIds: Array<Long>? = null,
        peerId: Long? = null,
        startMessageId: Long? = null,
        groupId: Long? = null
    ) : this() {
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

    override val classRef = MessagesMarkAsReadMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
