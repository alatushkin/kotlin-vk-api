package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Marks and unmarks conversations as important.
 *
 *  [https://vk.com/dev/messages.markAsImportantConversation]
 *  @property [group_id] Group ID (for group messages with group access token)
 *  @property [peer_id] ID of conversation to mark as important.
 *  @property [important] '1' — to add a star (mark as important), '0' — to remove the star
 */
class MessagesMarkAsImportantConversationMethod() : VkMethod<Boolean>(
    "messages.markAsImportantConversation",
    HashMap()
) {

    var groupId: Long? by props
    var peerId: Long? by props
    var important: Boolean? by props

    constructor(
        groupId: Long? = null,
        peerId: Long? = null,
        important: Boolean? = null
    ) : this() {
        this.groupId = groupId
        this.peerId = peerId
        this.important = important
    }

    fun setGroupId(groupId: Long): MessagesMarkAsImportantConversationMethod {
        this.groupId = groupId
        return this
    }

    fun setPeerId(peerId: Long): MessagesMarkAsImportantConversationMethod {
        this.peerId = peerId
        return this
    }

    fun setImportant(important: Boolean): MessagesMarkAsImportantConversationMethod {
        this.important = important
        return this
    }

    override val classRef = MessagesMarkAsImportantConversationMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
