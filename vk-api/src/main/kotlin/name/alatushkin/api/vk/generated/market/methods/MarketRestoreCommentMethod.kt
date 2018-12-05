@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/market.restoreComment]
 *
 * Restores a recently deleted comment
 *
 * @property ownerId identifier of an item owner community, "Note that community id in the 'owner_id' parameter should be negative number. For example 'owner_id'=-1 matches the [vk.com/apiclub|VK API] community "
 * @property commentId deleted comment id
 */
class MarketRestoreCommentMethod(
        ownerId: Long,
        commentId: Long
) : VkMethod<Boolean>(
    "market.restoreComment",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var ownerId: Long by props
    var commentId: Long by props

    init {
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
}
