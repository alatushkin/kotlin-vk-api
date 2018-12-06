@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/messages.delete]
 *
 * Deletes one or more messages.
 *
 * @property messageIds Message IDs.
 * @property spam '1' — to mark message as spam.
 * @property deleteForAll '1' — delete message for for all.
 * @property groupId Group ID (for group messages with user access token)
 */
class MessagesDeleteMethod(
    messageIds: Array<Long>? = null,
    spam: Boolean? = null,
    deleteForAll: Boolean? = null,
    groupId: Long? = null
) : VkMethod<Map<Long, Boolean>>(
    "messages.delete",
    mutableMapOf(),
    successReference()
), UserGroupMethod {

    var messageIds: Array<Long>? by props
    var spam: Boolean? by props
    var deleteForAll: Boolean? by props
    var groupId: Long? by props

    init {
        this.messageIds = messageIds
        this.spam = spam
        this.deleteForAll = deleteForAll
        this.groupId = groupId
    }
}
