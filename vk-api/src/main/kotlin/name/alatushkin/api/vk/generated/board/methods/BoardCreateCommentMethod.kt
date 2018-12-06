@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.board.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/board.createComment]
 *
 * Adds a comment on a topic on a community's discussion board.
 *
 * @property groupId ID of the community that owns the discussion board.
 * @property topicId ID of the topic to be commented on.
 * @property message (Required if 'attachments' is not set.) Text of the comment.
 * @property attachments (Required if 'text' is not set.) List of media objects attached to the comment, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' — Type of media object: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, '<owner_id>' — ID of the media owner. '<media_id>' — Media ID.
 * @property fromGroup '1' — to post the comment as by the community, '0' — to post the comment as by the user (default)
 * @property stickerId Sticker ID.
 * @property guid Unique identifier to avoid repeated comments.
 */
class BoardCreateCommentMethod(
    groupId: Long,
    topicId: Long,
    message: String? = null,
    attachments: Array<String>? = null,
    fromGroup: Boolean? = null,
    stickerId: Long? = null,
    guid: String? = null
) : VkMethod<Long>(
    "board.createComment",
    mutableMapOf(),
    successReference()
), UserMethod {

    var groupId: Long by props
    var topicId: Long by props
    var message: String? by props
    var attachments: Array<String>? by props
    var fromGroup: Boolean? by props
    var stickerId: Long? by props
    var guid: String? by props

    init {
        this.groupId = groupId
        this.topicId = topicId
        this.message = message
        this.attachments = attachments
        this.fromGroup = fromGroup
        this.stickerId = stickerId
        this.guid = guid
    }
}
