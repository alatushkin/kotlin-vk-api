package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Deletes an item.
 *
 *  [https://vk.com/dev/market.delete]
 *  @property [owner_id] ID of an item owner community.
 *  @property [item_id] Item ID.
 */
class MarketDeleteMethod() : VkMethod<Boolean>(
    "market.delete",
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

    fun setOwnerId(ownerId: Long): MarketDeleteMethod {
        this.ownerId = ownerId
        return this
    }

    fun setItemId(itemId: Long): MarketDeleteMethod {
        this.itemId = itemId
        return this
    }

    override val classRef = MarketDeleteMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
