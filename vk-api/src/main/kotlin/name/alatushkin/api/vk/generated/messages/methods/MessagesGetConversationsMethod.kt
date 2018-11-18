package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.messages.ConversationWithMessage
import name.alatushkin.api.vk.generated.messages.GetConversationsFilter

/**
 *  Returns a list of the current user's conversations.
 *
 *  [https://vk.com/dev/messages.getConversations]
 *  @property [group_id] Group ID (for group messages with group access token)
 *  @property [offset] Offset needed to return a specific subset of conversations.
 *  @property [count] Number of conversations to return.
 *  @property [filter] Filter to apply: 'all' — all conversations, 'unread' — conversations with unread messages, 'important' — conversations, marked as important (only for community messages), 'unanswered' — conversations, marked as unanswered (only for community messages)
 *  @property [extended] '1' — return extra information about users and communities
 *  @property [start_message_id] ID of the message from what to return dialogs.
 *  @property [fields] Profile and communities fields to return.
 */
class MessagesGetConversationsMethod() : VkMethod<VkList<ConversationWithMessage>>(
    "messages.getConversations",
    HashMap()
) {

    var groupId: Long? by props
    var offset: Long? by props
    var count: Long? by props
    var filter: GetConversationsFilter? by props
    var extended: Boolean? by props
    var startMessageId: Long? by props
    var fields: Array<String>? by props

    constructor(
        groupId: Long? = null,
        offset: Long? = null,
        count: Long? = null,
        filter: GetConversationsFilter? = null,
        extended: Boolean? = null,
        startMessageId: Long? = null,
        fields: Array<String>? = null
    ) : this() {
        this.groupId = groupId
        this.offset = offset
        this.count = count
        this.filter = filter
        this.extended = extended
        this.startMessageId = startMessageId
        this.fields = fields
    }

    fun setGroupId(groupId: Long): MessagesGetConversationsMethod {
        this.groupId = groupId
        return this
    }

    fun setOffset(offset: Long): MessagesGetConversationsMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): MessagesGetConversationsMethod {
        this.count = count
        return this
    }

    fun setFilter(filter: GetConversationsFilter): MessagesGetConversationsMethod {
        this.filter = filter
        return this
    }

    fun setExtended(extended: Boolean): MessagesGetConversationsMethod {
        this.extended = extended
        return this
    }

    fun setStartMessageId(startMessageId: Long): MessagesGetConversationsMethod {
        this.startMessageId = startMessageId
        return this
    }

    fun setFields(fields: Array<String>): MessagesGetConversationsMethod {
        this.fields = fields
        return this
    }

    override val classRef = MessagesGetConversationsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<ConversationWithMessage>>>() {}
    }
}
