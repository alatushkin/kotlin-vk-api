@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/messages.markAsAnsweredConversation]
 *
 * Marks and unmarks conversations as unanswered.
 *
 * @property groupId Group ID (for group messages with group access token)
 * @property peerId ID of conversation to mark as important.
 * @property answered '1' — to mark as answered, '0' — to remove the mark
 */
class MessagesMarkAsAnsweredConversationMethod(
        groupId: Long? = null,
        peerId: Long,
        answered: Boolean? = null
) : VkMethod<Boolean>(
    "messages.markAsAnsweredConversation",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserGroupMethod {

    var groupId: Long? by props
    var peerId: Long by props
    var answered: Boolean? by props

    init {
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
}
