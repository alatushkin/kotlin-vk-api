package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Edits a comment on a user wall or community wall.
 *
 *  [https://vk.com/dev/wall.editComment]
 *  @property [owner_id] User ID or community ID. Use a negative value to designate a community ID.
 *  @property [comment_id] Comment ID.
 *  @property [message] New comment text.
 *  @property [attachments] List of objects attached to the comment, in the following format: , "<owner_id>_<media_id>,<owner_id>_<media_id>", '' — Type of media attachment: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, '<owner_id>' — ID of the media attachment owner. '<media_id>' — Media attachment ID. For example: "photo100172_166443618,photo66748_265827614"
 */
class WallEditCommentMethod() : VkMethod<Boolean>(
    "wall.editComment",
    HashMap()
) {

    var ownerId: Long? by props
    var commentId: Long? by props
    var message: String? by props
    var attachments: Array<String>? by props

    constructor(
        ownerId: Long? = null,
        commentId: Long? = null,
        message: String? = null,
        attachments: Array<String>? = null
    ) : this() {
        this.ownerId = ownerId
        this.commentId = commentId
        this.message = message
        this.attachments = attachments
    }

    fun setOwnerId(ownerId: Long): WallEditCommentMethod {
        this.ownerId = ownerId
        return this
    }

    fun setCommentId(commentId: Long): WallEditCommentMethod {
        this.commentId = commentId
        return this
    }

    fun setMessage(message: String): WallEditCommentMethod {
        this.message = message
        return this
    }

    fun setAttachments(attachments: Array<String>): WallEditCommentMethod {
        this.attachments = attachments
        return this
    }

    override val classRef = WallEditCommentMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
