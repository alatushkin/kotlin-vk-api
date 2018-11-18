package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.market.MarketAlbum

/**
 *  Returns items album's data
 *
 *  [https://vk.com/dev/market.getAlbumById]
 *  @property [owner_id] identifier of an album owner community, "Note that community id in the 'owner_id' parameter should be negative number. For example 'owner_id'=-1 matches the [vk.com/apiclub|VK API] community "
 *  @property [album_ids] collections identifiers to obtain data from
 */
class MarketGetAlbumByIdMethod() : VkMethod<VkList<MarketAlbum>>(
    "market.getAlbumById",
    HashMap()
) {

    var ownerId: Long? by props
    var albumIds: Array<Long>? by props

    constructor(
        ownerId: Long? = null,
        albumIds: Array<Long>? = null
    ) : this() {
        this.ownerId = ownerId
        this.albumIds = albumIds
    }

    fun setOwnerId(ownerId: Long): MarketGetAlbumByIdMethod {
        this.ownerId = ownerId
        return this
    }

    fun setAlbumIds(albumIds: Array<Long>): MarketGetAlbumByIdMethod {
        this.albumIds = albumIds
        return this
    }

    override val classRef = MarketGetAlbumByIdMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<MarketAlbum>>>() {}
    }
}
