package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Marks and unmarks messages as important (starred).
 *
 *  [https://vk.com/dev/messages.markAsImportant]
 *  @property [message_ids] IDs of messages to mark as important.
 *  @property [important] '1' — to add a star (mark as important), '0' — to remove the star
 */
class MessagesMarkAsImportantMethod() : VkMethod<Array<Long>>(
    "messages.markAsImportant",
    HashMap()
) {

    var messageIds: Array<Long>? by props
    var important: Boolean? by props

    constructor(
        messageIds: Array<Long>? = null,
        important: Boolean? = null
    ) : this() {
        this.messageIds = messageIds
        this.important = important
    }

    fun setMessageIds(messageIds: Array<Long>): MessagesMarkAsImportantMethod {
        this.messageIds = messageIds
        return this
    }

    fun setImportant(important: Boolean): MessagesMarkAsImportantMethod {
        this.important = important
        return this
    }

    override val classRef = MessagesMarkAsImportantMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Array<Long>>>() {}
    }
}
