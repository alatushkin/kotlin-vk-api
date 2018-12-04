@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/video.createComment]
 *
 * Adds a new comment on a video.
 *
 * @property ownerId ID of the user or community that owns the video.
 * @property videoId Video ID.
 * @property message New comment text.
 * @property attachments List of objects attached to the comment, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' — Type of media attachment: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, '<owner_id>' — ID of the media attachment owner. '<media_id>' — Media attachment ID. Example: "photo100172_166443618,photo66748_265827614"
 * @property fromGroup '1' — to post the comment from a community name (only if 'owner_id'<0)
 * @property replyToComment 
 * @property stickerId 
 * @property guid 
 */
class VideoCreateCommentMethod(
        ownerId: Long? = null,
        videoId: Long,
        message: String? = null,
        attachments: Array<String>? = null,
        fromGroup: Boolean? = null,
        replyToComment: Long? = null,
        stickerId: Long? = null,
        guid: String? = null
) : VkMethod<Long>(
    "video.createComment",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Long>>() {}
), UserMethod {

    var ownerId: Long? by props
    var videoId: Long by props
    var message: String? by props
    var attachments: Array<String>? by props
    var fromGroup: Boolean? by props
    var replyToComment: Long? by props
    var stickerId: Long? by props
    var guid: String? by props

    init {
        this.ownerId = ownerId
        this.videoId = videoId
        this.message = message
        this.attachments = attachments
        this.fromGroup = fromGroup
        this.replyToComment = replyToComment
        this.stickerId = stickerId
        this.guid = guid
    }

    fun setOwnerId(ownerId: Long): VideoCreateCommentMethod {
        this.ownerId = ownerId
        return this
    }

    fun setVideoId(videoId: Long): VideoCreateCommentMethod {
        this.videoId = videoId
        return this
    }

    fun setMessage(message: String): VideoCreateCommentMethod {
        this.message = message
        return this
    }

    fun setAttachments(attachments: Array<String>): VideoCreateCommentMethod {
        this.attachments = attachments
        return this
    }

    fun setFromGroup(fromGroup: Boolean): VideoCreateCommentMethod {
        this.fromGroup = fromGroup
        return this
    }

    fun setReplyToComment(replyToComment: Long): VideoCreateCommentMethod {
        this.replyToComment = replyToComment
        return this
    }

    fun setStickerId(stickerId: Long): VideoCreateCommentMethod {
        this.stickerId = stickerId
        return this
    }

    fun setGuid(guid: String): VideoCreateCommentMethod {
        this.guid = guid
        return this
    }
}
