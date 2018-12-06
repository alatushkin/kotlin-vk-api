@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.messages.IsMessagesFromGroupAllowedResponse
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserGroupMethod {

    var groupId: Long by props
    var userId: Long by props

    init {
        this.groupId = groupId
        this.userId = userId
    }
}
