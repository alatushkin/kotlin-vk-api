package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.common.Reason

/**
 *  Sends a complaint to the item's comment.
 *
 *  [https://vk.com/dev/market.reportComment]
 *  @property [owner_id] ID of an item owner community.
 *  @property [comment_id] Comment ID.
 *  @property [reason] Complaint reason. Possible values: *'0' — spam,, *'1' — child porn,, *'2' — extremism,, *'3' — violence,, *'4' — drugs propaganda,, *'5' — adult materials,, *'6' — insult.
 */
class MarketReportCommentMethod() : VkMethod<Boolean>(
    "market.reportComment",
    HashMap()
) {

    var ownerId: Long? by props
    var commentId: Long? by props
    var reason: Reason? by props

    constructor(
        ownerId: Long? = null,
        commentId: Long? = null,
        reason: Reason? = null
    ) : this() {
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

    override val classRef = MarketReportCommentMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
