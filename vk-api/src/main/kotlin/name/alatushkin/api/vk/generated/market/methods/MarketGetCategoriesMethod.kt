@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.market.MarketCategory
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/market.getCategories]
 *
 * Returns a list of market categories.
 *
 * @property count Number of results to return.
 * @property offset Offset needed to return a specific subset of results.
 */
class MarketGetCategoriesMethod(
        count: Long? = null,
        offset: Long? = null
) : VkMethod<VkList<MarketCategory>>(
    "market.getCategories",
    mutableMapOf(),
    object : TypeReference<VkSuccess<VkList<MarketCategory>>>() {}
), UserMethod {

    var count: Long? by props
    var offset: Long? by props

    init {
        this.count = count
        this.offset = offset
    }

    fun setCount(count: Long): MarketGetCategoriesMethod {
        this.count = count
        return this
    }

    fun setOffset(offset: Long): MarketGetCategoriesMethod {
        this.offset = offset
        return this
    }
}
