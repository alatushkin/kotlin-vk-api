@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var ownerId: Long by props
    var commentId: Long by props

    init {
        this.ownerId = ownerId
        this.commentId = commentId
    }
}
