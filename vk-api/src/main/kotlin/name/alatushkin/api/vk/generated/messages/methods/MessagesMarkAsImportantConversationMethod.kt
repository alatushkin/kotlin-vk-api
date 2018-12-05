@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/messages.markAsImportantConversation]
 *
 * Marks and unmarks conversations as important.
 *
 * @property groupId Group ID (for group messages with group access token)
 * @property peerId ID of conversation to mark as important.
 * @property important '1' — to add a star (mark as important), '0' — to remove the star
 */
class MessagesMarkAsImportantConversationMethod(
        groupId: Long? = null,
        peerId: Long,
        important: Boolean? = null
) : VkMethod<Boolean>(
    "messages.markAsImportantConversation",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserGroupMethod {

    var groupId: Long? by props
    var peerId: Long by props
    var important: Boolean? by props

    init {
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
}
