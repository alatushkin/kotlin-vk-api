package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.common.Reason

/**
 *  Reports (submits a complaint about) a post on a user wall or community wall.
 *
 *  [https://vk.com/dev/wall.reportPost]
 *  @property [owner_id] ID of the user or community that owns the wall.
 *  @property [post_id] Post ID.
 *  @property [reason] Reason for the complaint: '0' – spam, '1' – child pornography, '2' – extremism, '3' – violence, '4' – drug propaganda, '5' – adult material, '6' – insult, abuse
 */
class WallReportPostMethod() : VkMethod<Boolean>(
    "wall.reportPost",
    HashMap()
) {

    var ownerId: Long? by props
    var postId: Long? by props
    var reason: Reason? by props

    constructor(
        ownerId: Long? = null,
        postId: Long? = null,
        reason: Reason? = null
    ) : this() {
        this.ownerId = ownerId
        this.postId = postId
        this.reason = reason
    }

    fun setOwnerId(ownerId: Long): WallReportPostMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPostId(postId: Long): WallReportPostMethod {
        this.postId = postId
        return this
    }

    fun setReason(reason: Reason): WallReportPostMethod {
        this.reason = reason
        return this
    }

    override val classRef = WallReportPostMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
