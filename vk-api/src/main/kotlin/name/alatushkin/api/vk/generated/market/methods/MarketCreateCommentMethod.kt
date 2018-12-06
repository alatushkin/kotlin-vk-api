@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/market.createComment]
 *
 * Creates a new comment for an item.
 *
 * @property ownerId ID of an item owner community.
 * @property itemId Item ID.
 * @property message Comment text (required if 'attachments' parameter is not specified)
 * @property attachments Comma-separated list of objects attached to a comment. The field is submitted the following way: , "'<owner_id>_<media_id>,<owner_id>_<media_id>'", , '' - media attachment type: "'photo' - photo, 'video' - video, 'audio' - audio, 'doc' - document", , '<owner_id>' - media owner id, '<media_id>' - media attachment id, , For example: "photo100172_166443618,photo66748_265827614",
 * @property fromGroup '1' - comment will be published on behalf of a community, '0' - on behalf of a user (by default).
 * @property replyToComment ID of a comment to reply with current comment to.
 * @property stickerId Sticker ID.
 * @property guid Random value to avoid resending one comment.
 */
class MarketCreateCommentMethod(
    ownerId: Long,
    itemId: Long,
    message: String? = null,
    attachments: Array<String>? = null,
    fromGroup: Boolean? = null,
    replyToComment: Long? = null,
    stickerId: Long? = null,
    guid: String? = null
) : VkMethod<Long>(
    "market.createComment",
    mutableMapOf(),
    successReference()
), UserMethod {

    var ownerId: Long by props
    var itemId: Long by props
    var message: String? by props
    var attachments: Array<String>? by props
    var fromGroup: Boolean? by props
    var replyToComment: Long? by props
    var stickerId: Long? by props
    var guid: String? by props

    init {
        this.ownerId = ownerId
        this.itemId = itemId
        this.message = message
        this.attachments = attachments
        this.fromGroup = fromGroup
        this.replyToComment = replyToComment
        this.stickerId = stickerId
        this.guid = guid
    }
}
