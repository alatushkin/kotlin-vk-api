@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserGroupMethod {

    var messageIds: Array<Long>? by props
    var important: Boolean? by props

    init {
        this.messageIds = messageIds
        this.important = important
    }
}
