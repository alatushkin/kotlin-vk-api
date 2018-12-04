@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/messages.denyMessagesFromGroup]
 *
 * Denies sending message from community to the current user.
 *
 * @property groupId Group ID.
 */
class MessagesDenyMessagesFromGroupMethod(
        groupId: Long
) : VkMethod<Boolean>(
    "messages.denyMessagesFromGroup",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserMethod {

    var groupId: Long by props

    init {
        this.groupId = groupId
    }

    fun setGroupId(groupId: Long): MessagesDenyMessagesFromGroupMethod {
        this.groupId = groupId
        return this
    }
}
