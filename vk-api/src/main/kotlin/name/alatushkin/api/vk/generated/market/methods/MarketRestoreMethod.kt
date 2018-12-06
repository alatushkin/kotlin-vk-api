@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/market.restore]
 *
 * Restores recently deleted item
 *
 * @property ownerId ID of an item owner community.
 * @property itemId Deleted item ID.
 */
class MarketRestoreMethod(
    ownerId: Long,
    itemId: Long
) : VkMethod<Boolean>(
    "market.restore",
    mutableMapOf(),
    successReference()
), UserMethod {

    var ownerId: Long by props
    var itemId: Long by props

    init {
        this.ownerId = ownerId
        this.itemId = itemId
    }
}
