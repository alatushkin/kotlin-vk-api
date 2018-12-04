package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Marks and unmarks conversations as unanswered.
 *
 *  [https://vk.com/dev/messages.markAsAnsweredConversation]
 *  @property [group_id] Group ID (for group messages with group access token)
 *  @property [peer_id] ID of conversation to mark as important.
 *  @property [answered] '1' — to mark as answered, '0' — to remove the mark
 */
class MessagesMarkAsAnsweredConversationMethod() : VkMethod<Boolean>(
    "messages.markAsAnsweredConversation",
    HashMap()
) {

    var groupId: Long? by props
    var peerId: Long? by props
    var answered: Boolean? by props

    constructor(
        groupId: Long? = null,
        peerId: Long? = null,
        answered: Boolean? = null
    ) : this() {
        this.groupId = groupId
        this.peerId = peerId
        this.answered = answered
    }

    fun setGroupId(groupId: Long): MessagesMarkAsAnsweredConversationMethod {
        this.groupId = groupId
        return this
    }

    fun setPeerId(peerId: Long): MessagesMarkAsAnsweredConversationMethod {
        this.peerId = peerId
        return this
    }

    fun setAnswered(answered: Boolean): MessagesMarkAsAnsweredConversationMethod {
        this.answered = answered
        return this
    }

    override val classRef = MessagesMarkAsAnsweredConversationMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
