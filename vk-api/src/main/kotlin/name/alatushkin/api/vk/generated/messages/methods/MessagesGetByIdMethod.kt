@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.messages.Message
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/messages.getById]
 *
 * Returns messages by their IDs.
 *
 * @property messageIds Message IDs.
 * @property previewLength Number of characters after which to truncate a previewed message. To preview the full message, specify '0'. "NOTE: Messages are not truncated by default. Messages are truncated by words."
 * @property extended Information whether the response should be extended
 * @property fields Profile fields to return.
 * @property groupId Group ID (for group messages with group access token)
 */
class MessagesGetByIdMethod(
    messageIds: Array<Long>,
    previewLength: Long? = null,
    extended: Boolean? = null,
    fields: Array<String>? = null,
    groupId: Long? = null
) : VkMethod<VkList<Message>>(
    "messages.getById",
    mutableMapOf(),
    successReference()
), UserGroupMethod {

    var messageIds: Array<Long> by props
    var previewLength: Long? by props
    var extended: Boolean? by props
    var fields: Array<String>? by props
    var groupId: Long? by props

    init {
        this.messageIds = messageIds
        this.previewLength = previewLength
        this.extended = extended
        this.fields = fields
        this.groupId = groupId
    }
}
