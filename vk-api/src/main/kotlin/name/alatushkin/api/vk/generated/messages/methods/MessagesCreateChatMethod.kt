@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/messages.createChat]
 *
 * Creates a chat with several participants.
 *
 * @property userIds IDs of the users to be added to the chat.
 * @property title Chat title.
 */
class MessagesCreateChatMethod(
    userIds: Array<Long>,
    title: String? = null
) : VkMethod<Long>(
    "messages.createChat",
    mutableMapOf(),
    successReference()
), UserMethod {

    var userIds: Array<Long> by props
    var title: String? by props

    init {
        this.userIds = userIds
        this.title = title
    }
}
