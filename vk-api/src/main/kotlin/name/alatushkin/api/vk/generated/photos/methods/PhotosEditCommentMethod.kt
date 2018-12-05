@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.editComment]
 *
 * Edits a comment on a photo.
 *
 * @property ownerId ID of the user or community that owns the photo.
 * @property commentId Comment ID.
 * @property message New text of the comment.
 * @property attachments (Required if 'message' is not set.) List of objects attached to the post, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' — Type of media attachment: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, '<owner_id>' — Media attachment owner ID. '<media_id>' — Media attachment ID. Example: "photo100172_166443618,photo66748_265827614"
 */
class PhotosEditCommentMethod(
        ownerId: Long? = null,
        commentId: Long,
        message: String? = null,
        attachments: Array<String>? = null
) : VkMethod<Boolean>(
    "photos.editComment",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var ownerId: Long? by props
    var commentId: Long by props
    var message: String? by props
    var attachments: Array<String>? by props

    init {
        this.ownerId = ownerId
        this.commentId = commentId
        this.message = message
        this.attachments = attachments
    }

    fun setOwnerId(ownerId: Long): PhotosEditCommentMethod {
        this.ownerId = ownerId
        return this
    }

    fun setCommentId(commentId: Long): PhotosEditCommentMethod {
        this.commentId = commentId
        return this
    }

    fun setMessage(message: String): PhotosEditCommentMethod {
        this.message = message
        return this
    }

    fun setAttachments(attachments: Array<String>): PhotosEditCommentMethod {
        this.attachments = attachments
        return this
    }
}
