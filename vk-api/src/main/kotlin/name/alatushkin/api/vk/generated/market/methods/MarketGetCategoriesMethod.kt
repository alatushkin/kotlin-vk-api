package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.market.MarketCategory

/**
 *  Returns a list of market categories.
 *
 *  [https://vk.com/dev/market.getCategories]
 *  @property [count] Number of results to return.
 *  @property [offset] Offset needed to return a specific subset of results.
 */
class MarketGetCategoriesMethod() : VkMethod<VkList<MarketCategory>>(
    "market.getCategories",
    HashMap()
) {

    var count: Long? by props
    var offset: Long? by props

    constructor(
        count: Long? = null,
        offset: Long? = null
    ) : this() {
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

    override val classRef = MarketGetCategoriesMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<MarketCategory>>>() {}
    }
}
