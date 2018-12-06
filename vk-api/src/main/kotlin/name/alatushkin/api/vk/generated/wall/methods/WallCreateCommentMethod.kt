@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.wall.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.wall.CreateCommentResponse
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/wall.createComment]
 *
 * Adds a comment to a post on a user wall or community wall.
 *
 * @property ownerId User ID or community ID. Use a negative value to designate a community ID.
 * @property postId Post ID.
 * @property fromGroup Group ID.
 * @property message (Required if 'attachments' is not set.) Text of the comment.
 * @property replyToComment ID of comment to reply.
 * @property attachments (Required if 'message' is not set.) List of media objects attached to the comment, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' — Type of media ojbect: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, '<owner_id>' — ID of the media owner. '<media_id>' — Media ID. For example: "photo100172_166443618,photo66748_265827614"
 * @property stickerId Sticker ID.
 * @property guid Unique identifier to avoid repeated comments.
 */
class WallCreateCommentMethod(
    ownerId: Long? = null,
    postId: Long,
    fromGroup: Long? = null,
    message: String? = null,
    replyToComment: Long? = null,
    attachments: Array<String>? = null,
    stickerId: Long? = null,
    guid: String? = null
) : VkMethod<CreateCommentResponse>(
    "wall.createComment",
    mutableMapOf(),
    successReference()
), UserMethod {

    var ownerId: Long? by props
    var postId: Long by props
    var fromGroup: Long? by props
    var message: String? by props
    var replyToComment: Long? by props
    var attachments: Array<String>? by props
    var stickerId: Long? by props
    var guid: String? by props

    init {
        this.ownerId = ownerId
        this.postId = postId
        this.fromGroup = fromGroup
        this.message = message
        this.replyToComment = replyToComment
        this.attachments = attachments
        this.stickerId = stickerId
        this.guid = guid
    }
}
