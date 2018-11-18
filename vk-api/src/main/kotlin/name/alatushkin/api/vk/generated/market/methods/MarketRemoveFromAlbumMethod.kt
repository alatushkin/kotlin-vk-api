package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Removes an item from one or multiple collections.
 *
 *  [https://vk.com/dev/market.removeFromAlbum]
 *  @property [owner_id] ID of an item owner community.
 *  @property [item_id] Item ID.
 *  @property [album_ids] Collections IDs to remove item from.
 */
class MarketRemoveFromAlbumMethod() : VkMethod<Boolean>(
    "market.removeFromAlbum",
    HashMap()
) {

    var ownerId: Long? by props
    var itemId: Long? by props
    var albumIds: Array<Long>? by props

    constructor(
        ownerId: Long? = null,
        itemId: Long? = null,
        albumIds: Array<Long>? = null
    ) : this() {
        this.ownerId = ownerId
        this.itemId = itemId
        this.albumIds = albumIds
    }

    fun setOwnerId(ownerId: Long): MarketRemoveFromAlbumMethod {
        this.ownerId = ownerId
        return this
    }

    fun setItemId(itemId: Long): MarketRemoveFromAlbumMethod {
        this.itemId = itemId
        return this
    }

    fun setAlbumIds(albumIds: Array<Long>): MarketRemoveFromAlbumMethod {
        this.albumIds = albumIds
        return this
    }

    override val classRef = MarketRemoveFromAlbumMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
