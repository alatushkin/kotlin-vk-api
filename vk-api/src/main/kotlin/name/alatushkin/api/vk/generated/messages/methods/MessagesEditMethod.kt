@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/messages.edit]
 *
 * Edits the message.
 *
 * @property peerId Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
 * @property message (Required if 'attachments' is not set.) Text of the message.
 * @property lat Geographical latitude of a check-in, in degrees (from -90 to 90).
 * @property long Geographical longitude of a check-in, in degrees (from -180 to 180).
 * @property attachment (Required if 'message' is not set.) List of objects attached to the message, separated by commas, in the following format: "<owner_id>_<media_id>", '' — Type of media attachment: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, 'wall' — wall post, '<owner_id>' — ID of the media attachment owner. '<media_id>' — media attachment ID. Example: "photo100172_166443618"
 * @property keepForwardMessages '1' — to keep forwarded, messages.
 * @property keepSnippets '1' — to keep attached snippets.
 * @property groupId Group ID (for group messages with user access token)
 */
class MessagesEditMethod(
    peerId: Long,
    message: String? = null,
    lat: Double? = null,
    long: Double? = null,
    attachment: Array<String>? = null,
    keepForwardMessages: Boolean? = null,
    keepSnippets: Boolean? = null,
    groupId: Long? = null
) : VkMethod<Boolean>(
    "messages.edit",
    mutableMapOf(),
    successReference()
), UserGroupMethod {

    var peerId: Long by props
    var message: String? by props
    var lat: Double? by props
    var long: Double? by props
    var attachment: Array<String>? by props
    var keepForwardMessages: Boolean? by props
    var keepSnippets: Boolean? by props
    var groupId: Long? by props

    init {
        this.peerId = peerId
        this.message = message
        this.lat = lat
        this.long = long
        this.attachment = attachment
        this.keepForwardMessages = keepForwardMessages
        this.keepSnippets = keepSnippets
        this.groupId = groupId
    }
}
