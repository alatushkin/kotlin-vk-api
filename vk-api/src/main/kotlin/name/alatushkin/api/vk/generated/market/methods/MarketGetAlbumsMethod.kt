@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.market.MarketAlbum
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/market.getAlbums]
 *
 * Returns community's collections list.
 *
 * @property ownerId ID of an items owner community.
 * @property offset Offset needed to return a specific subset of results.
 * @property count Number of items to return.
 */
class MarketGetAlbumsMethod(
    ownerId: Long,
    offset: Long? = null,
    count: Long? = null
) : VkMethod<VkList<MarketAlbum>>(
    "market.getAlbums",
    mutableMapOf(),
    successReference()
), UserMethod {

    var ownerId: Long by props
    var offset: Long? by props
    var count: Long? by props

    init {
        this.ownerId = ownerId
        this.offset = offset
        this.count = count
    }
}
