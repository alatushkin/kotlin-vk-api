@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.messages.GetHistoryAttachmentsMediaType
import name.alatushkin.api.vk.generated.messages.GetHistoryAttachmentsResponse
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/messages.getHistoryAttachments]
 *
 * Returns media files from the dialog or group chat.
 *
 * @property peerId Peer ID. ", For group chat: '2000000000 + chat ID' , , For community: '-community ID'"
 * @property mediaType Type of media files to return: *'photo',, *'video',, *'audio',, *'doc',, *'link'.,*'market'.,*'wall'.,*'share'
 * @property startFrom Message ID to start return results from.
 * @property count Number of objects to return.
 * @property photoSizes '1' — to return photo sizes in a
 * @property fields Additional profile [vk.com/dev/fields|fields] to return.
 * @property groupId Group ID (for group messages with group access token)
 */
class MessagesGetHistoryAttachmentsMethod(
    peerId: Long,
    mediaType: GetHistoryAttachmentsMediaType? = null,
    startFrom: String? = null,
    count: Long? = null,
    photoSizes: Boolean? = null,
    fields: Array<String>? = null,
    groupId: Long? = null
) : VkMethod<GetHistoryAttachmentsResponse>(
    "messages.getHistoryAttachments",
    mutableMapOf(),
    successReference()
), UserGroupMethod {

    var peerId: Long by props
    var mediaType: GetHistoryAttachmentsMediaType? by props
    var startFrom: String? by props
    var count: Long? by props
    var photoSizes: Boolean? by props
    var fields: Array<String>? by props
    var groupId: Long? by props

    init {
        this.peerId = peerId
        this.mediaType = mediaType
        this.startFrom = startFrom
        this.count = count
        this.photoSizes = photoSizes
        this.fields = fields
        this.groupId = groupId
    }
}
