package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.video.GetCatalogExtendedResponse

/**
 *  Returns video catalog
 *
 *  [https://vk.com/dev/video.getCatalog]
 *  @property [count] number of catalog blocks to return.
 *  @property [items_count] number of videos in each block.
 *  @property [from] parameter for requesting the next results page. Value for transmitting here is returned in the 'next' field in a reply.
 *  @property [filters] list of requested catalog sections
 */
class VideoGetCatalogMethodExtended() : VkMethod<GetCatalogExtendedResponse>(
    "video.getCatalog",
    mutableMapOf("extended" to "1")
) {

    var count: Long? by props
    var itemsCount: Long? by props
    var from: String? by props
    var filters: Array<String>? by props

    constructor(
        count: Long? = null,
        itemsCount: Long? = null,
        from: String? = null,
        filters: Array<String>? = null
    ) : this() {
        this.count = count
        this.itemsCount = itemsCount
        this.from = from
        this.filters = filters
    }

    fun setCount(count: Long): VideoGetCatalogMethodExtended {
        this.count = count
        return this
    }

    fun setItemsCount(itemsCount: Long): VideoGetCatalogMethodExtended {
        this.itemsCount = itemsCount
        return this
    }

    fun setFrom(from: String): VideoGetCatalogMethodExtended {
        this.from = from
        return this
    }

    fun setFilters(filters: Array<String>): VideoGetCatalogMethodExtended {
        this.filters = filters
        return this
    }

    override val classRef = VideoGetCatalogMethodExtended.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<GetCatalogExtendedResponse>>() {}
    }
}
