package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.wall.CreateCommentResponse

/**
 *  Adds a comment to a post on a user wall or community wall.
 *
 *  [https://vk.com/dev/wall.createComment]
 *  @property [owner_id] User ID or community ID. Use a negative value to designate a community ID.
 *  @property [post_id] Post ID.
 *  @property [from_group] Group ID.
 *  @property [message] (Required if 'attachments' is not set.) Text of the comment.
 *  @property [reply_to_comment] ID of comment to reply.
 *  @property [attachments] (Required if 'message' is not set.) List of media objects attached to the comment, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' — Type of media ojbect: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, '<owner_id>' — ID of the media owner. '<media_id>' — Media ID. For example: "photo100172_166443618,photo66748_265827614"
 *  @property [sticker_id] Sticker ID.
 *  @property [guid] Unique identifier to avoid repeated comments.
 */
class WallCreateCommentMethod() : VkMethod<CreateCommentResponse>(
    "wall.createComment",
    HashMap()
) {

    var ownerId: Long? by props
    var postId: Long? by props
    var fromGroup: Long? by props
    var message: String? by props
    var replyToComment: Long? by props
    var attachments: Array<String>? by props
    var stickerId: Long? by props
    var guid: String? by props

    constructor(
        ownerId: Long? = null,
        postId: Long? = null,
        fromGroup: Long? = null,
        message: String? = null,
        replyToComment: Long? = null,
        attachments: Array<String>? = null,
        stickerId: Long? = null,
        guid: String? = null
    ) : this() {
        this.ownerId = ownerId
        this.postId = postId
        this.fromGroup = fromGroup
        this.message = message
        this.replyToComment = replyToComment
        this.attachments = attachments
        this.stickerId = stickerId
        this.guid = guid
    }

    fun setOwnerId(ownerId: Long): WallCreateCommentMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPostId(postId: Long): WallCreateCommentMethod {
        this.postId = postId
        return this
    }

    fun setFromGroup(fromGroup: Long): WallCreateCommentMethod {
        this.fromGroup = fromGroup
        return this
    }

    fun setMessage(message: String): WallCreateCommentMethod {
        this.message = message
        return this
    }

    fun setReplyToComment(replyToComment: Long): WallCreateCommentMethod {
        this.replyToComment = replyToComment
        return this
    }

    fun setAttachments(attachments: Array<String>): WallCreateCommentMethod {
        this.attachments = attachments
        return this
    }

    fun setStickerId(stickerId: Long): WallCreateCommentMethod {
        this.stickerId = stickerId
        return this
    }

    fun setGuid(guid: String): WallCreateCommentMethod {
        this.guid = guid
        return this
    }

    override val classRef = WallCreateCommentMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<CreateCommentResponse>>() {}
    }
}
