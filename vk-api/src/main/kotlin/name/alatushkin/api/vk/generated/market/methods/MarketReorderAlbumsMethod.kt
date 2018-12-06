@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
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
    successReference()
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
}
