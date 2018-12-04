@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/messages.restore]
 *
 * Restores a deleted message.
 *
 * @property messageId ID of a previously-deleted message to restore.
 * @property groupId Group ID (for group messages with user access token)
 */
class MessagesRestoreMethod(
        messageId: Long,
        groupId: Long? = null
) : VkMethod<Boolean>(
    "messages.restore",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserGroupMethod {

    var messageId: Long by props
    var groupId: Long? by props

    init {
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
}
