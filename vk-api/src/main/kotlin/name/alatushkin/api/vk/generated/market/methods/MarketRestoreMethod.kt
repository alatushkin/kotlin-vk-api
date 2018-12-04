@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
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
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserMethod {

    var ownerId: Long by props
    var itemId: Long by props

    init {
        this.ownerId = ownerId
        this.itemId = itemId
    }

    fun setOwnerId(ownerId: Long): MarketRestoreMethod {
        this.ownerId = ownerId
        return this
    }

    fun setItemId(itemId: Long): MarketRestoreMethod {
        this.itemId = itemId
        return this
    }
}
