@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.messages.ConversationWithMessage
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/messages.getConversationsById]
 *
 * Returns conversations by their IDs
 *
 * @property peerIds Destination IDs. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
 * @property extended Return extended properties
 * @property fields Profile and communities fields to return.
 * @property groupId Group ID (for group messages with group access token)
 */
class MessagesGetConversationsByIdMethod(
    peerIds: Array<Long>,
    extended: Boolean? = null,
    fields: Array<String>? = null,
    groupId: Long? = null
) : VkMethod<VkList<ConversationWithMessage>>(
    "messages.getConversationsById",
    mutableMapOf(),
    successReference()
), UserGroupMethod {

    var peerIds: Array<Long> by props
    var extended: Boolean? by props
    var fields: Array<String>? by props
    var groupId: Long? by props

    init {
        this.peerIds = peerIds
        this.extended = extended
        this.fields = fields
        this.groupId = groupId
    }
}
