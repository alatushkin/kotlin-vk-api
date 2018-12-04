@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/market.deleteComment]
 *
 * Deletes an item's comment
 *
 * @property ownerId identifier of an item owner community, "Note that community id in the 'owner_id' parameter should be negative number. For example 'owner_id'=-1 matches the [vk.com/apiclub|VK API] community "
 * @property commentId comment id
 */
class MarketDeleteCommentMethod(
        ownerId: Long,
        commentId: Long
) : VkMethod<Boolean>(
    "market.deleteComment",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserMethod {

    var ownerId: Long by props
    var commentId: Long by props

    init {
        this.ownerId = ownerId
        this.commentId = commentId
    }

    fun setOwnerId(ownerId: Long): MarketDeleteCommentMethod {
        this.ownerId = ownerId
        return this
    }

    fun setCommentId(commentId: Long): MarketDeleteCommentMethod {
        this.commentId = commentId
        return this
    }
}
