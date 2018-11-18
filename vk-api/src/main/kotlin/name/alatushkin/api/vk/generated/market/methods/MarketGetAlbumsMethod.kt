package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.market.MarketAlbum

/**
 *  Returns community's collections list.
 *
 *  [https://vk.com/dev/market.getAlbums]
 *  @property [owner_id] ID of an items owner community.
 *  @property [offset] Offset needed to return a specific subset of results.
 *  @property [count] Number of items to return.
 */
class MarketGetAlbumsMethod() : VkMethod<VkList<MarketAlbum>>(
    "market.getAlbums",
    HashMap()
) {

    var ownerId: Long? by props
    var offset: Long? by props
    var count: Long? by props

    constructor(
        ownerId: Long? = null,
        offset: Long? = null,
        count: Long? = null
    ) : this() {
        this.ownerId = ownerId
        this.offset = offset
        this.count = count
    }

    fun setOwnerId(ownerId: Long): MarketGetAlbumsMethod {
        this.ownerId = ownerId
        return this
    }

    fun setOffset(offset: Long): MarketGetAlbumsMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): MarketGetAlbumsMethod {
        this.count = count
        return this
    }

    override val classRef = MarketGetAlbumsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<MarketAlbum>>>() {}
    }
}
