@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
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
    successReference()
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
}
