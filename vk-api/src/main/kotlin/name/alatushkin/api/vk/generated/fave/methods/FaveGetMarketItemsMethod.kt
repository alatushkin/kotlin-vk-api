package name.alatushkin.api.vk.generated.fave.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.market.MarketItem

/**
 *  Returns market items bookmarked by current user.
 *
 *  [https://vk.com/dev/fave.getMarketItems]
 *  @property [count] Number of results to return.
 *  @property [extended] '1' – to return additional fields 'likes, can_comment, can_repost, photos'. By default: '0'.
 */
class FaveGetMarketItemsMethod() : VkMethod<VkList<MarketItem>>(
    "fave.getMarketItems",
    HashMap()
) {

    var count: Long? by props
    var extended: Boolean? by props

    constructor(
        count: Long? = null,
        extended: Boolean? = null
    ) : this() {
        this.count = count
        this.extended = extended
    }

    fun setCount(count: Long): FaveGetMarketItemsMethod {
        this.count = count
        return this
    }

    fun setExtended(extended: Boolean): FaveGetMarketItemsMethod {
        this.extended = extended
        return this
    }

    override val classRef = FaveGetMarketItemsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<VkList<MarketItem>>>() {}
    }
}
