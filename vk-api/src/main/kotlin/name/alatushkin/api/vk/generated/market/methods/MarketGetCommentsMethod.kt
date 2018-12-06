@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.market.GetCommentsSort
import name.alatushkin.api.vk.generated.wall.WallComment
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/market.getComments]
 *
 * Returns comments list for an item.
 *
 * @property ownerId ID of an item owner community
 * @property itemId Item ID.
 * @property needLikes '1' — to return likes info.
 * @property startCommentId ID of a comment to start a list from (details below).
 * @property count Number of results to return.
 * @property sort Sort order ('asc' — from old to new, 'desc' — from new to old)
 * @property extended '1' — comments will be returned as numbered objects, in addition lists of 'profiles' and 'groups' objects will be returned.
 * @property fields List of additional profile fields to return. See the [vk.com/dev/fields|details]
 */
class MarketGetCommentsMethod(
    ownerId: Long,
    itemId: Long,
    needLikes: Boolean? = null,
    startCommentId: Long? = null,
    count: Long? = null,
    sort: GetCommentsSort? = null,
    extended: Boolean? = null,
    fields: Array<String>? = null
) : VkMethod<VkList<WallComment>>(
    "market.getComments",
    mutableMapOf(),
    successReference()
), UserMethod {

    var ownerId: Long by props
    var itemId: Long by props
    var needLikes: Boolean? by props
    var startCommentId: Long? by props
    var count: Long? by props
    var sort: GetCommentsSort? by props
    var extended: Boolean? by props
    var fields: Array<String>? by props

    init {
        this.ownerId = ownerId
        this.itemId = itemId
        this.needLikes = needLikes
        this.startCommentId = startCommentId
        this.count = count
        this.sort = sort
        this.extended = extended
        this.fields = fields
    }
}
