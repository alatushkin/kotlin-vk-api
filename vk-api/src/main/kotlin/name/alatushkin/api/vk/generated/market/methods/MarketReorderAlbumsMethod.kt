@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/market.reorderAlbums]
 *
 * Reorders the collections list.
 *
 * @property ownerId ID of an item owner community.
 * @property albumId Collection ID.
 * @property before ID of a collection to place current collection before it.
 * @property after ID of a collection to place current collection after it.
 */
class MarketReorderAlbumsMethod(
        ownerId: Long,
        albumId: Long,
        before: Long? = null,
        after: Long? = null
) : VkMethod<Boolean>(
    "market.reorderAlbums",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserMethod {

    var ownerId: Long by props
    var albumId: Long by props
    var before: Long? by props
    var after: Long? by props

    init {
        this.ownerId = ownerId
        this.albumId = albumId
        this.before = before
        this.after = after
    }

    fun setOwnerId(ownerId: Long): MarketReorderAlbumsMethod {
        this.ownerId = ownerId
        return this
    }

    fun setAlbumId(albumId: Long): MarketReorderAlbumsMethod {
        this.albumId = albumId
        return this
    }

    fun setBefore(before: Long): MarketReorderAlbumsMethod {
        this.before = before
        return this
    }

    fun setAfter(after: Long): MarketReorderAlbumsMethod {
        this.after = after
        return this
    }
}
