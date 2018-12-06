@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/market.reorderItems]
 *
 * Changes item place in a collection.
 *
 * @property ownerId ID of an item owner community.
 * @property albumId ID of a collection to reorder items in. Set 0 to reorder full items list.
 * @property itemId Item ID.
 * @property before ID of an item to place current item before it.
 * @property after ID of an item to place current item after it.
 */
class MarketReorderItemsMethod(
    ownerId: Long,
    albumId: Long? = null,
    itemId: Long,
    before: Long? = null,
    after: Long? = null
) : VkMethod<Boolean>(
    "market.reorderItems",
    mutableMapOf(),
    successReference()
), UserMethod {

    var ownerId: Long by props
    var albumId: Long? by props
    var itemId: Long by props
    var before: Long? by props
    var after: Long? by props

    init {
        this.ownerId = ownerId
        this.albumId = albumId
        this.itemId = itemId
        this.before = before
        this.after = after
    }
}
