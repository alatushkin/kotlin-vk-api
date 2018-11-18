package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Changes item place in a collection.
 *
 *  [https://vk.com/dev/market.reorderItems]
 *  @property [owner_id] ID of an item owner community.
 *  @property [album_id] ID of a collection to reorder items in. Set 0 to reorder full items list.
 *  @property [item_id] Item ID.
 *  @property [before] ID of an item to place current item before it.
 *  @property [after] ID of an item to place current item after it.
 */
class MarketReorderItemsMethod() : VkMethod<Boolean>(
    "market.reorderItems",
    HashMap()
) {

    var ownerId: Long? by props
    var albumId: Long? by props
    var itemId: Long? by props
    var before: Long? by props
    var after: Long? by props

    constructor(
        ownerId: Long? = null,
        albumId: Long? = null,
        itemId: Long? = null,
        before: Long? = null,
        after: Long? = null
    ) : this() {
        this.ownerId = ownerId
        this.albumId = albumId
        this.itemId = itemId
        this.before = before
        this.after = after
    }

    fun setOwnerId(ownerId: Long): MarketReorderItemsMethod {
        this.ownerId = ownerId
        return this
    }

    fun setAlbumId(albumId: Long): MarketReorderItemsMethod {
        this.albumId = albumId
        return this
    }

    fun setItemId(itemId: Long): MarketReorderItemsMethod {
        this.itemId = itemId
        return this
    }

    fun setBefore(before: Long): MarketReorderItemsMethod {
        this.before = before
        return this
    }

    fun setAfter(after: Long): MarketReorderItemsMethod {
        this.after = after
        return this
    }

    override val classRef = MarketReorderItemsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
