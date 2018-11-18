package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkDate
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.market.MarketItemFull

/**
 *  Searches market items in a community's catalog
 *
 *  [https://vk.com/dev/market.search]
 *  @property [owner_id] ID of an items owner community.
 *  @property [q] Search query, for example "pink slippers".
 *  @property [price_from] Minimum item price value.
 *  @property [price_to] Maximum item price value.
 *  @property [tags] Comma-separated tag IDs list.
 *  @property [rev] '0' — do not use reverse order, '1' — use reverse order
 *  @property [offset] Offset needed to return a specific subset of results.
 *  @property [count] Number of items to return.
 */
class MarketSearchMethodExtended() : VkMethod<VkList<MarketItemFull>>(
    "market.search",
    mutableMapOf("extended" to "1")
) {

    var ownerId: Long? by props
    var q: String? by props
    var priceFrom: Long? by props
    var priceTo: Long? by props
    var tags: Array<Long>? by props
    var rev: VkDate? by props
    var offset: Long? by props
    var count: Long? by props

    constructor(
        ownerId: Long? = null,
        q: String? = null,
        priceFrom: Long? = null,
        priceTo: Long? = null,
        tags: Array<Long>? = null,
        rev: VkDate? = null,
        offset: Long? = null,
        count: Long? = null
    ) : this() {
        this.ownerId = ownerId
        this.q = q
        this.priceFrom = priceFrom
        this.priceTo = priceTo
        this.tags = tags
        this.rev = rev
        this.offset = offset
        this.count = count
    }

    fun setOwnerId(ownerId: Long): MarketSearchMethodExtended {
        this.ownerId = ownerId
        return this
    }

    fun setQ(q: String): MarketSearchMethodExtended {
        this.q = q
        return this
    }

    fun setPriceFrom(priceFrom: Long): MarketSearchMethodExtended {
        this.priceFrom = priceFrom
        return this
    }

    fun setPriceTo(priceTo: Long): MarketSearchMethodExtended {
        this.priceTo = priceTo
        return this
    }

    fun setTags(tags: Array<Long>): MarketSearchMethodExtended {
        this.tags = tags
        return this
    }

    fun setRev(rev: VkDate): MarketSearchMethodExtended {
        this.rev = rev
        return this
    }

    fun setOffset(offset: Long): MarketSearchMethodExtended {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): MarketSearchMethodExtended {
        this.count = count
        return this
    }

    override val classRef = MarketSearchMethodExtended.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<MarketItemFull>>>() {}
    }
}
