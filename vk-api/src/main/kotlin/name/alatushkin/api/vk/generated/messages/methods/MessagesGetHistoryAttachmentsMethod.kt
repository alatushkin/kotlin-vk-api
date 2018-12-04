package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.messages.GetHistoryAttachmentsMediaType
import name.alatushkin.api.vk.generated.messages.GetHistoryAttachmentsResponse

/**
 *  Returns media files from the dialog or group chat.
 *
 *  [https://vk.com/dev/messages.getHistoryAttachments]
 *  @property [peer_id] Peer ID. ", For group chat: '2000000000 + chat ID' , , For community: '-community ID'"
 *  @property [media_type] Type of media files to return: *'photo',, *'video',, *'audio',, *'doc',, *'link'.,*'market'.,*'wall'.,*'share'
 *  @property [start_from] Message ID to start return results from.
 *  @property [count] Number of objects to return.
 *  @property [photo_sizes] '1' — to return photo sizes in a
 *  @property [fields] Additional profile [vk.com/dev/fields|fields] to return.
 *  @property [group_id] Group ID (for group messages with group access token)
 */
class MessagesGetHistoryAttachmentsMethod() : VkMethod<GetHistoryAttachmentsResponse>(
    "messages.getHistoryAttachments",
    HashMap()
) {

    var peerId: Long? by props
    var mediaType: GetHistoryAttachmentsMediaType? by props
    var startFrom: String? by props
    var count: Long? by props
    var photoSizes: Boolean? by props
    var fields: Array<String>? by props
    var groupId: Long? by props

    constructor(
        peerId: Long? = null,
        mediaType: GetHistoryAttachmentsMediaType? = null,
        startFrom: String? = null,
        count: Long? = null,
        photoSizes: Boolean? = null,
        fields: Array<String>? = null,
        groupId: Long? = null
    ) : this() {
        this.peerId = peerId
        this.mediaType = mediaType
        this.startFrom = startFrom
        this.count = count
        this.photoSizes = photoSizes
        this.fields = fields
        this.groupId = groupId
    }

    fun setPeerId(peerId: Long): MessagesGetHistoryAttachmentsMethod {
        this.peerId = peerId
        return this
    }

    fun setMediaType(mediaType: GetHistoryAttachmentsMediaType): MessagesGetHistoryAttachmentsMethod {
        this.mediaType = mediaType
        return this
    }

    fun setStartFrom(startFrom: String): MessagesGetHistoryAttachmentsMethod {
        this.startFrom = startFrom
        return this
    }

    fun setCount(count: Long): MessagesGetHistoryAttachmentsMethod {
        this.count = count
        return this
    }

    fun setPhotoSizes(photoSizes: Boolean): MessagesGetHistoryAttachmentsMethod {
        this.photoSizes = photoSizes
        return this
    }

    fun setFields(fields: Array<String>): MessagesGetHistoryAttachmentsMethod {
        this.fields = fields
        return this
    }

    fun setGroupId(groupId: Long): MessagesGetHistoryAttachmentsMethod {
        this.groupId = groupId
        return this
    }

    override val classRef = MessagesGetHistoryAttachmentsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<GetHistoryAttachmentsResponse>>() {}
    }
}
