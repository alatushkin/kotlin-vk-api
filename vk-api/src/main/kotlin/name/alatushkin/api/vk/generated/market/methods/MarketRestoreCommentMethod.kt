package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Restores a recently deleted comment
 *
 *  [https://vk.com/dev/market.restoreComment]
 *  @property [owner_id] identifier of an item owner community, "Note that community id in the 'owner_id' parameter should be negative number. For example 'owner_id'=-1 matches the [vk.com/apiclub|VK API] community "
 *  @property [comment_id] deleted comment id
 */
class MarketRestoreCommentMethod() : VkMethod<Boolean>(
    "market.restoreComment",
    HashMap()
) {

    var ownerId: Long? by props
    var commentId: Long? by props

    constructor(
        ownerId: Long? = null,
        commentId: Long? = null
    ) : this() {
        this.ownerId = ownerId
        this.commentId = commentId
    }

    fun setOwnerId(ownerId: Long): MarketRestoreCommentMethod {
        this.ownerId = ownerId
        return this
    }

    fun setCommentId(commentId: Long): MarketRestoreCommentMethod {
        this.commentId = commentId
        return this
    }

    override val classRef = MarketRestoreCommentMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
