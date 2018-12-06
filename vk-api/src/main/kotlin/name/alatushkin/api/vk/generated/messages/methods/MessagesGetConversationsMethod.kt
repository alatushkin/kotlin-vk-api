@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.messages.GetConversationsFilter
import name.alatushkin.api.vk.generated.messages.GetConversationsResponse
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/messages.getConversations]
 *
 * Returns a list of the current user's conversations.
 *
 * @property groupId Group ID (for group messages with group access token)
 * @property offset Offset needed to return a specific subset of conversations.
 * @property count Number of conversations to return.
 * @property filter Filter to apply: 'all' — all conversations, 'unread' — conversations with unread messages, 'important' — conversations, marked as important (only for community messages), 'unanswered' — conversations, marked as unanswered (only for community messages)
 * @property extended '1' — return extra information about users and communities
 * @property startMessageId ID of the message from what to return dialogs.
 * @property fields Profile and communities fields to return.
 */
class MessagesGetConversationsMethod(
    groupId: Long? = null,
    offset: Long? = null,
    count: Long? = null,
    filter: GetConversationsFilter? = null,
    extended: Boolean? = null,
    startMessageId: Long? = null,
    fields: Array<String>? = null
) : VkMethod<GetConversationsResponse>(
    "messages.getConversations",
    mutableMapOf(),
    successReference()
), UserGroupMethod {

    var groupId: Long? by props
    var offset: Long? by props
    var count: Long? by props
    var filter: GetConversationsFilter? by props
    var extended: Boolean? by props
    var startMessageId: Long? by props
    var fields: Array<String>? by props

    init {
        this.groupId = groupId
        this.offset = offset
        this.count = count
        this.filter = filter
        this.extended = extended
        this.startMessageId = startMessageId
        this.fields = fields
    }
}
