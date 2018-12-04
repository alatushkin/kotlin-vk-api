package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Restores a deleted message.
 *
 *  [https://vk.com/dev/messages.restore]
 *  @property [message_id] ID of a previously-deleted message to restore.
 *  @property [group_id] Group ID (for group messages with user access token)
 */
class MessagesRestoreMethod() : VkMethod<Boolean>(
    "messages.restore",
    HashMap()
) {

    var messageId: Long? by props
    var groupId: Long? by props

    constructor(
        messageId: Long? = null,
        groupId: Long? = null
    ) : this() {
        this.messageId = messageId
        this.groupId = groupId
    }

    fun setMessageId(messageId: Long): MessagesRestoreMethod {
        this.messageId = messageId
        return this
    }

    fun setGroupId(groupId: Long): MessagesRestoreMethod {
        this.groupId = groupId
        return this
    }

    override val classRef = MessagesRestoreMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
