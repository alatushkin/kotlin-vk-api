@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var ownerId: Long by props
    var albumId: Long by props

    init {
        this.ownerId = ownerId
        this.albumId = albumId
    }
}
