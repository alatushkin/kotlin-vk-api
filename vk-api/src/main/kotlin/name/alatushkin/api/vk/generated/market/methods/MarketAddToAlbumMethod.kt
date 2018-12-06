@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/market.addToAlbum]
 *
 * Adds an item to one or multiple collections.
 *
 * @property ownerId ID of an item owner community.
 * @property itemId Item ID.
 * @property albumIds Collections IDs to add item to.
 */
class MarketAddToAlbumMethod(
    ownerId: Long,
    itemId: Long,
    albumIds: Array<Long>
) : VkMethod<Boolean>(
    "market.addToAlbum",
    mutableMapOf(),
    successReference()
), UserMethod {

    var ownerId: Long by props
    var itemId: Long by props
    var albumIds: Array<Long> by props

    init {
        this.ownerId = ownerId
        this.itemId = itemId
        this.albumIds = albumIds
    }
}
