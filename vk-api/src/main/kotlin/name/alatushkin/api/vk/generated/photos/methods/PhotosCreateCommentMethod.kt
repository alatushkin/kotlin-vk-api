@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.createComment]
 *
 * Adds a new comment on the photo.
 *
 * @property ownerId ID of the user or community that owns the photo.
 * @property photoId Photo ID.
 * @property message Comment text.
 * @property attachments (Required if 'message' is not set.) List of objects attached to the post, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' — Type of media attachment: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, '<owner_id>' — Media attachment owner ID. '<media_id>' — Media attachment ID. Example: "photo100172_166443618,photo66748_265827614"
 * @property fromGroup '1' — to post a comment from the community
 * @property replyToComment 
 * @property stickerId 
 * @property accessKey 
 * @property guid 
 */
class PhotosCreateCommentMethod(
        ownerId: Long? = null,
        photoId: Long,
        message: String? = null,
        attachments: Array<String>? = null,
        fromGroup: Boolean? = null,
        replyToComment: Long? = null,
        stickerId: Long? = null,
        accessKey: String? = null,
        guid: String? = null
) : VkMethod<Long>(
    "photos.createComment",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Long>>() {}
), UserMethod {

    var ownerId: Long? by props
    var photoId: Long by props
    var message: String? by props
    var attachments: Array<String>? by props
    var fromGroup: Boolean? by props
    var replyToComment: Long? by props
    var stickerId: Long? by props
    var accessKey: String? by props
    var guid: String? by props

    init {
        this.ownerId = ownerId
        this.photoId = photoId
        this.message = message
        this.attachments = attachments
        this.fromGroup = fromGroup
        this.replyToComment = replyToComment
        this.stickerId = stickerId
        this.accessKey = accessKey
        this.guid = guid
    }

    fun setOwnerId(ownerId: Long): PhotosCreateCommentMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPhotoId(photoId: Long): PhotosCreateCommentMethod {
        this.photoId = photoId
        return this
    }

    fun setMessage(message: String): PhotosCreateCommentMethod {
        this.message = message
        return this
    }

    fun setAttachments(attachments: Array<String>): PhotosCreateCommentMethod {
        this.attachments = attachments
        return this
    }

    fun setFromGroup(fromGroup: Boolean): PhotosCreateCommentMethod {
        this.fromGroup = fromGroup
        return this
    }

    fun setReplyToComment(replyToComment: Long): PhotosCreateCommentMethod {
        this.replyToComment = replyToComment
        return this
    }

    fun setStickerId(stickerId: Long): PhotosCreateCommentMethod {
        this.stickerId = stickerId
        return this
    }

    fun setAccessKey(accessKey: String): PhotosCreateCommentMethod {
        this.accessKey = accessKey
        return this
    }

    fun setGuid(guid: String): PhotosCreateCommentMethod {
        this.guid = guid
        return this
    }
}
