package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Creates a new comment for an item.
 *
 *  [https://vk.com/dev/market.createComment]
 *  @property [owner_id] ID of an item owner community.
 *  @property [item_id] Item ID.
 *  @property [message] Comment text (required if 'attachments' parameter is not specified)
 *  @property [attachments] Comma-separated list of objects attached to a comment. The field is submitted the following way: , "'<owner_id>_<media_id>,<owner_id>_<media_id>'", , '' - media attachment type: "'photo' - photo, 'video' - video, 'audio' - audio, 'doc' - document", , '<owner_id>' - media owner id, '<media_id>' - media attachment id, , For example: "photo100172_166443618,photo66748_265827614",
 *  @property [from_group] '1' - comment will be published on behalf of a community, '0' - on behalf of a user (by default).
 *  @property [reply_to_comment] ID of a comment to reply with current comment to.
 *  @property [sticker_id] Sticker ID.
 *  @property [guid] Random value to avoid resending one comment.
 */
class MarketCreateCommentMethod() : VkMethod<Long>(
    "market.createComment",
    HashMap()
) {

    var ownerId: Long? by props
    var itemId: Long? by props
    var message: String? by props
    var attachments: Array<String>? by props
    var fromGroup: Boolean? by props
    var replyToComment: Long? by props
    var stickerId: Long? by props
    var guid: String? by props

    constructor(
        ownerId: Long? = null,
        itemId: Long? = null,
        message: String? = null,
        attachments: Array<String>? = null,
        fromGroup: Boolean? = null,
        replyToComment: Long? = null,
        stickerId: Long? = null,
        guid: String? = null
    ) : this() {
        this.ownerId = ownerId
        this.itemId = itemId
        this.message = message
        this.attachments = attachments
        this.fromGroup = fromGroup
        this.replyToComment = replyToComment
        this.stickerId = stickerId
        this.guid = guid
    }

    fun setOwnerId(ownerId: Long): MarketCreateCommentMethod {
        this.ownerId = ownerId
        return this
    }

    fun setItemId(itemId: Long): MarketCreateCommentMethod {
        this.itemId = itemId
        return this
    }

    fun setMessage(message: String): MarketCreateCommentMethod {
        this.message = message
        return this
    }

    fun setAttachments(attachments: Array<String>): MarketCreateCommentMethod {
        this.attachments = attachments
        return this
    }

    fun setFromGroup(fromGroup: Boolean): MarketCreateCommentMethod {
        this.fromGroup = fromGroup
        return this
    }

    fun setReplyToComment(replyToComment: Long): MarketCreateCommentMethod {
        this.replyToComment = replyToComment
        return this
    }

    fun setStickerId(stickerId: Long): MarketCreateCommentMethod {
        this.stickerId = stickerId
        return this
    }

    fun setGuid(guid: String): MarketCreateCommentMethod {
        this.guid = guid
        return this
    }

    override val classRef = MarketCreateCommentMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Long>>() {}
    }
}
