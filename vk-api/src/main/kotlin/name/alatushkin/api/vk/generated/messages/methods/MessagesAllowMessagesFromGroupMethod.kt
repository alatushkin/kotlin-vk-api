@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/messages.allowMessagesFromGroup]
 *
 * Allows sending messages from community to the current user.
 *
 * @property groupId Group ID.
 */
class MessagesAllowMessagesFromGroupMethod(
    groupId: Long
) : VkMethod<Boolean>(
    "messages.allowMessagesFromGroup",
    mutableMapOf(),
    successReference()
), UserMethod {

    var groupId: Long by props

    init {
        this.groupId = groupId
    }
}
