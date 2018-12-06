@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.market.MarketCategory
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var count: Long? by props
    var offset: Long? by props

    init {
        this.count = count
        this.offset = offset
    }
}
