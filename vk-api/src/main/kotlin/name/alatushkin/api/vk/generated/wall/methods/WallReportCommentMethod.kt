package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.common.Reason

/**
 *  Reports (submits a complaint about) a comment on a post on a user wall or community wall.
 *
 *  [https://vk.com/dev/wall.reportComment]
 *  @property [owner_id] ID of the user or community that owns the wall.
 *  @property [comment_id] Comment ID.
 *  @property [reason] Reason for the complaint: '0' – spam, '1' – child pornography, '2' – extremism, '3' – violence, '4' – drug propaganda, '5' – adult material, '6' – insult, abuse
 */
class WallReportCommentMethod() : VkMethod<Boolean>(
    "wall.reportComment",
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

    fun setOwnerId(ownerId: Long): WallReportCommentMethod {
        this.ownerId = ownerId
        return this
    }

    fun setCommentId(commentId: Long): WallReportCommentMethod {
        this.commentId = commentId
        return this
    }

    fun setReason(reason: Reason): WallReportCommentMethod {
        this.reason = reason
        return this
    }

    override val classRef = WallReportCommentMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
