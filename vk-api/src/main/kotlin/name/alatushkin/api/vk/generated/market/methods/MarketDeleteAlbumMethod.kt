package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Deletes a collection of items.
 *
 *  [https://vk.com/dev/market.deleteAlbum]
 *  @property [owner_id] ID of an collection owner community.
 *  @property [album_id] Collection ID.
 */
class MarketDeleteAlbumMethod() : VkMethod<Boolean>(
    "market.deleteAlbum",
    HashMap()
) {

    var ownerId: Long? by props
    var albumId: Long? by props

    constructor(
        ownerId: Long? = null,
        albumId: Long? = null
    ) : this() {
        this.ownerId = ownerId
        this.albumId = albumId
    }

    fun setOwnerId(ownerId: Long): MarketDeleteAlbumMethod {
        this.ownerId = ownerId
        return this
    }

    fun setAlbumId(albumId: Long): MarketDeleteAlbumMethod {
        this.albumId = albumId
        return this
    }

    override val classRef = MarketDeleteAlbumMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
