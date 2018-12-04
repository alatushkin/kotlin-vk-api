package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Chages item comment's text
 *
 *  [https://vk.com/dev/market.editComment]
 *  @property [owner_id] ID of an item owner community.
 *  @property [comment_id] Comment ID.
 *  @property [message] New comment text (required if 'attachments' are not specified), , 2048 symbols maximum.
 *  @property [attachments] Comma-separated list of objects attached to a comment. The field is submitted the following way: , "'<owner_id>_<media_id>,<owner_id>_<media_id>'", , '' - media attachment type: "'photo' - photo, 'video' - video, 'audio' - audio, 'doc' - document", , '<owner_id>' - media owner id, '<media_id>' - media attachment id, , For example: "photo100172_166443618,photo66748_265827614",
 */
class MarketEditCommentMethod() : VkMethod<Boolean>(
    "market.editComment",
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

    fun setOwnerId(ownerId: Long): MarketEditCommentMethod {
        this.ownerId = ownerId
        return this
    }

    fun setCommentId(commentId: Long): MarketEditCommentMethod {
        this.commentId = commentId
        return this
    }

    fun setMessage(message: String): MarketEditCommentMethod {
        this.message = message
        return this
    }

    fun setAttachments(attachments: Array<String>): MarketEditCommentMethod {
        this.attachments = attachments
        return this
    }

    override val classRef = MarketEditCommentMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
