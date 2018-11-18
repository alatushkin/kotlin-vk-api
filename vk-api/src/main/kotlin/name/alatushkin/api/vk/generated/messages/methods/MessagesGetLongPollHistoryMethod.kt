package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.messages.GetLongPollHistoryResponse

/**
 *  Returns updates in user's private messages.
 *
 *  [https://vk.com/dev/messages.getLongPollHistory]
 *  @property [ts] Last value of the 'ts' parameter returned from the Long Poll server or by using [vk.com/dev/messages.getLongPollHistory|messages.getLongPollHistory] method.
 *  @property [pts] Lsat value of 'pts' parameter returned from the Long Poll server or by using [vk.com/dev/messages.getLongPollHistory|messages.getLongPollHistory] method.
 *  @property [preview_length] Number of characters after which to truncate a previewed message. To preview the full message, specify '0'. "NOTE: Messages are not truncated by default. Messages are truncated by words."
 *  @property [onlines] '1' — to return history with online users only.
 *  @property [fields] Additional profile [vk.com/dev/fields|fields] to return.
 *  @property [events_limit] Maximum number of events to return.
 *  @property [msgs_limit] Maximum number of messages to return.
 *  @property [max_msg_id] Maximum ID of the message among existing ones in the local copy. Both messages received with API methods (for example, , ), and data received from a Long Poll server (events with code 4) are taken into account.
 *  @property [group_id] Group ID (for group messages with user access token)
 */
class MessagesGetLongPollHistoryMethod() : VkMethod<GetLongPollHistoryResponse>(
    "messages.getLongPollHistory",
    HashMap()
) {

    var ts: Long? by props
    var pts: Long? by props
    var previewLength: Long? by props
    var onlines: Boolean? by props
    var fields: Array<String>? by props
    var eventsLimit: Long? by props
    var msgsLimit: Long? by props
    var maxMsgId: Long? by props
    var groupId: Long? by props

    constructor(
        ts: Long? = null,
        pts: Long? = null,
        previewLength: Long? = null,
        onlines: Boolean? = null,
        fields: Array<String>? = null,
        eventsLimit: Long? = null,
        msgsLimit: Long? = null,
        maxMsgId: Long? = null,
        groupId: Long? = null
    ) : this() {
        this.ts = ts
        this.pts = pts
        this.previewLength = previewLength
        this.onlines = onlines
        this.fields = fields
        this.eventsLimit = eventsLimit
        this.msgsLimit = msgsLimit
        this.maxMsgId = maxMsgId
        this.groupId = groupId
    }

    fun setTs(ts: Long): MessagesGetLongPollHistoryMethod {
        this.ts = ts
        return this
    }

    fun setPts(pts: Long): MessagesGetLongPollHistoryMethod {
        this.pts = pts
        return this
    }

    fun setPreviewLength(previewLength: Long): MessagesGetLongPollHistoryMethod {
        this.previewLength = previewLength
        return this
    }

    fun setOnlines(onlines: Boolean): MessagesGetLongPollHistoryMethod {
        this.onlines = onlines
        return this
    }

    fun setFields(fields: Array<String>): MessagesGetLongPollHistoryMethod {
        this.fields = fields
        return this
    }

    fun setEventsLimit(eventsLimit: Long): MessagesGetLongPollHistoryMethod {
        this.eventsLimit = eventsLimit
        return this
    }

    fun setMsgsLimit(msgsLimit: Long): MessagesGetLongPollHistoryMethod {
        this.msgsLimit = msgsLimit
        return this
    }

    fun setMaxMsgId(maxMsgId: Long): MessagesGetLongPollHistoryMethod {
        this.maxMsgId = maxMsgId
        return this
    }

    fun setGroupId(groupId: Long): MessagesGetLongPollHistoryMethod {
        this.groupId = groupId
        return this
    }

    override val classRef = MessagesGetLongPollHistoryMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<GetLongPollHistoryResponse>>() {}
    }
}
