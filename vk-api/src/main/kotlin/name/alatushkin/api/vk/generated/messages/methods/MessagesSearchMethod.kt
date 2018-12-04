@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.messages.Message
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/messages.search]
 *
 * Returns a list of the current user's private messages that match search criteria.
 *
 * @property q Search query string.
 * @property peerId Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
 * @property date Date to search message before in Unixtime.
 * @property previewLength Number of characters after which to truncate a previewed message. To preview the full message, specify '0'. "NOTE: Messages are not truncated by default. Messages are truncated by words."
 * @property offset Offset needed to return a specific subset of messages.
 * @property count Number of messages to return.
 * @property groupId Group ID (for group messages with group access token)
 */
class MessagesSearchMethod(
        q: String? = null,
        peerId: Long? = null,
        date: Long? = null,
        previewLength: Long? = null,
        offset: Long? = null,
        count: Long? = null,
        groupId: Long? = null
) : VkMethod<VkList<Message>>(
    "messages.search",
    mutableMapOf(),
    object : TypeReference<VkSuccess<VkList<Message>>>() {}
), UserGroupMethod {

    var q: String? by props
    var peerId: Long? by props
    var date: Long? by props
    var previewLength: Long? by props
    var offset: Long? by props
    var count: Long? by props
    var groupId: Long? by props

    init {
        this.q = q
        this.peerId = peerId
        this.date = date
        this.previewLength = previewLength
        this.offset = offset
        this.count = count
        this.groupId = groupId
    }

    fun setQ(q: String): MessagesSearchMethod {
        this.q = q
        return this
    }

    fun setPeerId(peerId: Long): MessagesSearchMethod {
        this.peerId = peerId
        return this
    }

    fun setDate(date: Long): MessagesSearchMethod {
        this.date = date
        return this
    }

    fun setPreviewLength(previewLength: Long): MessagesSearchMethod {
        this.previewLength = previewLength
        return this
    }

    fun setOffset(offset: Long): MessagesSearchMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): MessagesSearchMethod {
        this.count = count
        return this
    }

    fun setGroupId(groupId: Long): MessagesSearchMethod {
        this.groupId = groupId
        return this
    }
}
