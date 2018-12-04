package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Reorders the collections list.
 *
 *  [https://vk.com/dev/market.reorderAlbums]
 *  @property [owner_id] ID of an item owner community.
 *  @property [album_id] Collection ID.
 *  @property [before] ID of a collection to place current collection before it.
 *  @property [after] ID of a collection to place current collection after it.
 */
class MarketReorderAlbumsMethod() : VkMethod<Boolean>(
    "market.reorderAlbums",
    HashMap()
) {

    var ownerId: Long? by props
    var albumId: Long? by props
    var before: Long? by props
    var after: Long? by props

    constructor(
        ownerId: Long? = null,
        albumId: Long? = null,
        before: Long? = null,
        after: Long? = null
    ) : this() {
        this.ownerId = ownerId
        this.albumId = albumId
        this.before = before
        this.after = after
    }

    fun setOwnerId(ownerId: Long): MarketReorderAlbumsMethod {
        this.ownerId = ownerId
        return this
    }

    fun setAlbumId(albumId: Long): MarketReorderAlbumsMethod {
        this.albumId = albumId
        return this
    }

    fun setBefore(before: Long): MarketReorderAlbumsMethod {
        this.before = before
        return this
    }

    fun setAfter(after: Long): MarketReorderAlbumsMethod {
        this.after = after
        return this
    }

    override val classRef = MarketReorderAlbumsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
