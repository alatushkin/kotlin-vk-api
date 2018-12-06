@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkDate
import name.alatushkin.api.vk.generated.messages.GetHistoryResponse
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/messages.getHistory]
 *
 * Returns message history for the specified user or group chat.
 *
 * @property offset Offset needed to return a specific subset of messages.
 * @property count Number of messages to return.
 * @property userId ID of the user whose message history you want to return.
 * @property peerId 
 * @property startMessageId Starting message ID from which to return history.
 * @property extended Information whether the response should be extended
 * @property fields Profile fields to return.
 * @property groupId Group ID (for group messages with group access token)
 * @property rev Sort order: '1' — return messages in chronological order. '0' — return messages in reverse chronological order.
 */
class MessagesGetHistoryMethod(
    offset: Long? = null,
    count: Long? = null,
    userId: Long? = null,
    peerId: Long? = null,
    startMessageId: Long? = null,
    extended: Boolean? = null,
    fields: Array<String>? = null,
    groupId: Long? = null,
    rev: VkDate? = null
) : VkMethod<GetHistoryResponse>(
    "messages.getHistory",
    mutableMapOf(),
    successReference()
), UserGroupMethod {

    var offset: Long? by props
    var count: Long? by props
    var userId: Long? by props
    var peerId: Long? by props
    var startMessageId: Long? by props
    var extended: Boolean? by props
    var fields: Array<String>? by props
    var groupId: Long? by props
    var rev: VkDate? by props

    init {
        this.offset = offset
        this.count = count
        this.userId = userId
        this.peerId = peerId
        this.startMessageId = startMessageId
        this.extended = extended
        this.fields = fields
        this.groupId = groupId
        this.rev = rev
    }
}
