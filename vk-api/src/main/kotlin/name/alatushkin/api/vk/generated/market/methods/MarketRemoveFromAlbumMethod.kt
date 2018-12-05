@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/market.removeFromAlbum]
 *
 * Removes an item from one or multiple collections.
 *
 * @property ownerId ID of an item owner community.
 * @property itemId Item ID.
 * @property albumIds Collections IDs to remove item from.
 */
class MarketRemoveFromAlbumMethod(
        ownerId: Long,
        itemId: Long,
        albumIds: Array<Long>
) : VkMethod<Boolean>(
    "market.removeFromAlbum",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var ownerId: Long by props
    var itemId: Long by props
    var albumIds: Array<Long> by props

    init {
        this.ownerId = ownerId
        this.itemId = itemId
        this.albumIds = albumIds
    }

    fun setOwnerId(ownerId: Long): MarketRemoveFromAlbumMethod {
        this.ownerId = ownerId
        return this
    }

    fun setItemId(itemId: Long): MarketRemoveFromAlbumMethod {
        this.itemId = itemId
        return this
    }

    fun setAlbumIds(albumIds: Array<Long>): MarketRemoveFromAlbumMethod {
        this.albumIds = albumIds
        return this
    }
}
