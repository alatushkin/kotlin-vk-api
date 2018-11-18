package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.common.Reason

/**
 *  Reports (submits a complaint about) a comment on a photo.
 *
 *  [https://vk.com/dev/photos.reportComment]
 *  @property [owner_id] ID of the user or community that owns the photo.
 *  @property [comment_id] ID of the comment being reported.
 *  @property [reason] Reason for the complaint: '0' – spam, '1' – child pornography, '2' – extremism, '3' – violence, '4' – drug propaganda, '5' – adult material, '6' – insult, abuse
 */
class PhotosReportCommentMethod() : VkMethod<Boolean>(
    "photos.reportComment",
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

    fun setOwnerId(ownerId: Long): PhotosReportCommentMethod {
        this.ownerId = ownerId
        return this
    }

    fun setCommentId(commentId: Long): PhotosReportCommentMethod {
        this.commentId = commentId
        return this
    }

    fun setReason(reason: Reason): PhotosReportCommentMethod {
        this.reason = reason
        return this
    }

    override val classRef = PhotosReportCommentMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
