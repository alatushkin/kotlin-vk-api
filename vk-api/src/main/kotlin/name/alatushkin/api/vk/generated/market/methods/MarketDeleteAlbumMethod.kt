@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/market.deleteAlbum]
 *
 * Deletes a collection of items.
 *
 * @property ownerId ID of an collection owner community.
 * @property albumId Collection ID.
 */
class MarketDeleteAlbumMethod(
        ownerId: Long,
        albumId: Long
) : VkMethod<Boolean>(
    "market.deleteAlbum",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserMethod {

    var ownerId: Long by props
    var albumId: Long by props

    init {
        this.ownerId = ownerId
        this.albumId = albumId
    }

    fun setOwnerId(ownerId: Long): MarketDeleteAlbumMethod {
        this.ownerId = ownerId
        return this
    }

    fun setAlbumId(albumId: Long): MarketDeleteAlbumMethod {
        this.albumId = albumId
        return this
    }
}
