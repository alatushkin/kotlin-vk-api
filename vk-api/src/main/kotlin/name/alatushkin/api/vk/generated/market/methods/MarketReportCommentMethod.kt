@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.common.Reason
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/market.reportComment]
 *
 * Sends a complaint to the item's comment.
 *
 * @property ownerId ID of an item owner community.
 * @property commentId Comment ID.
 * @property reason Complaint reason. Possible values: *'0' — spam,, *'1' — child porn,, *'2' — extremism,, *'3' — violence,, *'4' — drugs propaganda,, *'5' — adult materials,, *'6' — insult.
 */
class MarketReportCommentMethod(
        ownerId: Long,
        commentId: Long,
        reason: Reason
) : VkMethod<Boolean>(
    "market.reportComment",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var ownerId: Long by props
    var commentId: Long by props
    var reason: Reason by props

    init {
        this.ownerId = ownerId
        this.commentId = commentId
        this.reason = reason
    }

    fun setOwnerId(ownerId: Long): MarketReportCommentMethod {
        this.ownerId = ownerId
        return this
    }

    fun setCommentId(commentId: Long): MarketReportCommentMethod {
        this.commentId = commentId
        return this
    }

    fun setReason(reason: Reason): MarketReportCommentMethod {
        this.reason = reason
        return this
    }
}
