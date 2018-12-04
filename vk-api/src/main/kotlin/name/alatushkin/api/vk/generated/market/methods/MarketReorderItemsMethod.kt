@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
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
    object : TypeReference<VkSuccess<Boolean>>() {}
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

    fun setOwnerId(ownerId: Long): MarketReorderItemsMethod {
        this.ownerId = ownerId
        return this
    }

    fun setAlbumId(albumId: Long): MarketReorderItemsMethod {
        this.albumId = albumId
        return this
    }

    fun setItemId(itemId: Long): MarketReorderItemsMethod {
        this.itemId = itemId
        return this
    }

    fun setBefore(before: Long): MarketReorderItemsMethod {
        this.before = before
        return this
    }

    fun setAfter(after: Long): MarketReorderItemsMethod {
        this.after = after
        return this
    }
}
