@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/market.delete]
 *
 * Deletes an item.
 *
 * @property ownerId ID of an item owner community.
 * @property itemId Item ID.
 */
class MarketDeleteMethod(
        ownerId: Long,
        itemId: Long
) : VkMethod<Boolean>(
    "market.delete",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var ownerId: Long by props
    var itemId: Long by props

    init {
        this.ownerId = ownerId
        this.itemId = itemId
    }

    fun setOwnerId(ownerId: Long): MarketDeleteMethod {
        this.ownerId = ownerId
        return this
    }

    fun setItemId(itemId: Long): MarketDeleteMethod {
        this.itemId = itemId
        return this
    }
}
