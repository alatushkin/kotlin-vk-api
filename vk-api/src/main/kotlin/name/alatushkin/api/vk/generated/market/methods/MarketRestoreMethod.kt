package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Restores recently deleted item
 *
 *  [https://vk.com/dev/market.restore]
 *  @property [owner_id] ID of an item owner community.
 *  @property [item_id] Deleted item ID.
 */
class MarketRestoreMethod() : VkMethod<Boolean>(
    "market.restore",
    HashMap()
) {

    var ownerId: Long? by props
    var itemId: Long? by props

    constructor(
        ownerId: Long? = null,
        itemId: Long? = null
    ) : this() {
        this.ownerId = ownerId
        this.itemId = itemId
    }

    fun setOwnerId(ownerId: Long): MarketRestoreMethod {
        this.ownerId = ownerId
        return this
    }

    fun setItemId(itemId: Long): MarketRestoreMethod {
        this.itemId = itemId
        return this
    }

    override val classRef = MarketRestoreMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
