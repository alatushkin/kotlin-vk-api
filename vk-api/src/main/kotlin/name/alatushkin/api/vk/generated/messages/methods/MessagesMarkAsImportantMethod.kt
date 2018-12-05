@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/messages.markAsImportant]
 *
 * Marks and unmarks messages as important (starred).
 *
 * @property messageIds IDs of messages to mark as important.
 * @property important '1' — to add a star (mark as important), '0' — to remove the star
 */
class MessagesMarkAsImportantMethod(
        messageIds: Array<Long>? = null,
        important: Boolean? = null
) : VkMethod<Array<Long>>(
    "messages.markAsImportant",
    mutableMapOf(),
    object : TypeReference<VkResponse<Array<Long>>>() {}
), UserGroupMethod {

    var messageIds: Array<Long>? by props
    var important: Boolean? by props

    init {
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
}
