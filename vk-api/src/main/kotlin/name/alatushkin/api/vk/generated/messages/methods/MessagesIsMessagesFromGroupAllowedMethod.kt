@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.messages.IsMessagesFromGroupAllowedResponse
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/messages.isMessagesFromGroupAllowed]
 *
 * Returns information whether sending messages from the community to current user is allowed.
 *
 * @property groupId Group ID.
 * @property userId User ID.
 */
class MessagesIsMessagesFromGroupAllowedMethod(
        groupId: Long,
        userId: Long
) : VkMethod<IsMessagesFromGroupAllowedResponse>(
    "messages.isMessagesFromGroupAllowed",
    mutableMapOf(),
    object : TypeReference<VkResponse<IsMessagesFromGroupAllowedResponse>>() {}
), UserGroupMethod {

    var groupId: Long by props
    var userId: Long by props

    init {
        this.groupId = groupId
        this.userId = userId
    }

    fun setGroupId(groupId: Long): MessagesIsMessagesFromGroupAllowedMethod {
        this.groupId = groupId
        return this
    }

    fun setUserId(userId: Long): MessagesIsMessagesFromGroupAllowedMethod {
        this.userId = userId
        return this
    }
}
