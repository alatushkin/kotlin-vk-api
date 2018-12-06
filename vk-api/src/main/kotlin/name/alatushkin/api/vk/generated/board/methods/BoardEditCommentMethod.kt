@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.board.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/board.editComment]
 *
 * Edits a comment on a topic on a community's discussion board.
 *
 * @property groupId ID of the community that owns the discussion board.
 * @property topicId Topic ID.
 * @property commentId ID of the comment on the topic.
 * @property message (Required if 'attachments' is not set). New comment text.
 * @property attachments (Required if 'message' is not set.) List of media objects attached to the comment, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' — Type of media object: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, '<owner_id>' — ID of the media owner. '<media_id>' — Media ID. Example: "photo100172_166443618,photo66748_265827614"
 */
class BoardEditCommentMethod(
    groupId: Long,
    topicId: Long,
    commentId: Long,
    message: String? = null,
    attachments: Array<String>? = null
) : VkMethod<Boolean>(
    "board.editComment",
    mutableMapOf(),
    successReference()
), UserMethod {

    var groupId: Long by props
    var topicId: Long by props
    var commentId: Long by props
    var message: String? by props
    var attachments: Array<String>? by props

    init {
        this.groupId = groupId
        this.topicId = topicId
        this.commentId = commentId
        this.message = message
        this.attachments = attachments
    }
}
