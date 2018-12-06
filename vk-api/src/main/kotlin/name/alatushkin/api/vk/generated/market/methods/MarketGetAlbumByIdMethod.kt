@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.market.MarketAlbum
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/market.getAlbumById]
 *
 * Returns items album's data
 *
 * @property ownerId identifier of an album owner community, "Note that community id in the 'owner_id' parameter should be negative number. For example 'owner_id'=-1 matches the [vk.com/apiclub|VK API] community "
 * @property albumIds collections identifiers to obtain data from
 */
class MarketGetAlbumByIdMethod(
    ownerId: Long,
    albumIds: Array<Long>
) : VkMethod<VkList<MarketAlbum>>(
    "market.getAlbumById",
    mutableMapOf(),
    successReference()
), UserMethod {

    var ownerId: Long by props
    var albumIds: Array<Long> by props

    init {
        this.ownerId = ownerId
        this.albumIds = albumIds
    }
}
