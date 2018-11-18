package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Deletes one or more messages.
 *
 *  [https://vk.com/dev/messages.delete]
 *  @property [message_ids] Message IDs.
 *  @property [spam] '1' — to mark message as spam.
 *  @property [delete_for_all] '1' — delete message for for all.
 *  @property [group_id] Group ID (for group messages with user access token)
 */
class MessagesDeleteMethod() : VkMethod<Map<Long, Boolean>>(
    "messages.delete",
    HashMap()
) {

    var messageIds: Array<Long>? by props
    var spam: Boolean? by props
    var deleteForAll: Boolean? by props
    var groupId: Long? by props

    constructor(
        messageIds: Array<Long>? = null,
        spam: Boolean? = null,
        deleteForAll: Boolean? = null,
        groupId: Long? = null
    ) : this() {
        this.messageIds = messageIds
        this.spam = spam
        this.deleteForAll = deleteForAll
        this.groupId = groupId
    }

    fun setMessageIds(messageIds: Array<Long>): MessagesDeleteMethod {
        this.messageIds = messageIds
        return this
    }

    fun setSpam(spam: Boolean): MessagesDeleteMethod {
        this.spam = spam
        return this
    }

    fun setDeleteForAll(deleteForAll: Boolean): MessagesDeleteMethod {
        this.deleteForAll = deleteForAll
        return this
    }

    fun setGroupId(groupId: Long): MessagesDeleteMethod {
        this.groupId = groupId
        return this
    }

    override val classRef = MessagesDeleteMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Map<Long, Boolean>>>() {}
    }
}
