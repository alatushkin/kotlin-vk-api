@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/market.editComment]
 *
 * Chages item comment's text
 *
 * @property ownerId ID of an item owner community.
 * @property commentId Comment ID.
 * @property message New comment text (required if 'attachments' are not specified), , 2048 symbols maximum.
 * @property attachments Comma-separated list of objects attached to a comment. The field is submitted the following way: , "'<owner_id>_<media_id>,<owner_id>_<media_id>'", , '' - media attachment type: "'photo' - photo, 'video' - video, 'audio' - audio, 'doc' - document", , '<owner_id>' - media owner id, '<media_id>' - media attachment id, , For example: "photo100172_166443618,photo66748_265827614",
 */
class MarketEditCommentMethod(
    ownerId: Long,
    commentId: Long,
    message: String? = null,
    attachments: Array<String>? = null
) : VkMethod<Boolean>(
    "market.editComment",
    mutableMapOf(),
    successReference()
), UserMethod {

    var ownerId: Long by props
    var commentId: Long by props
    var message: String? by props
    var attachments: Array<String>? by props

    init {
        this.ownerId = ownerId
        this.commentId = commentId
        this.message = message
        this.attachments = attachments
    }
}
