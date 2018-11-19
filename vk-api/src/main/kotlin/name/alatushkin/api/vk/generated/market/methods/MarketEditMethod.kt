package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Edits an item.
 *
 *  [https://vk.com/dev/market.edit]
 *  @property [owner_id] ID of an item owner community.
 *  @property [item_id] Item ID.
 *  @property [name] Item name.
 *  @property [description] Item description.
 *  @property [category_id] Item category ID.
 *  @property [price] Item price.
 *  @property [deleted] Item status ('1' — deleted, '0' — not deleted).
 *  @property [main_photo_id] Cover photo ID.
 *  @property [photo_ids] IDs of additional photos.
 */
class MarketEditMethod() : VkMethod<Boolean>(
    "market.edit",
    HashMap()
) {

    var ownerId: Long? by props
    var itemId: Long? by props
    var name: String? by props
    var description: String? by props
    var categoryId: Long? by props
    var price: Double? by props
    var deleted: Boolean? by props
    var mainPhotoId: Long? by props
    var photoIds: Array<Long>? by props

    constructor(
        ownerId: Long? = null,
        itemId: Long? = null,
        name: String? = null,
        description: String? = null,
        categoryId: Long? = null,
        price: Double? = null,
        deleted: Boolean? = null,
        mainPhotoId: Long? = null,
        photoIds: Array<Long>? = null
    ) : this() {
        this.ownerId = ownerId
        this.itemId = itemId
        this.name = name
        this.description = description
        this.categoryId = categoryId
        this.price = price
        this.deleted = deleted
        this.mainPhotoId = mainPhotoId
        this.photoIds = photoIds
    }

    fun setOwnerId(ownerId: Long): MarketEditMethod {
        this.ownerId = ownerId
        return this
    }

    fun setItemId(itemId: Long): MarketEditMethod {
        this.itemId = itemId
        return this
    }

    fun setName(name: String): MarketEditMethod {
        this.name = name
        return this
    }

    fun setDescription(description: String): MarketEditMethod {
        this.description = description
        return this
    }

    fun setCategoryId(categoryId: Long): MarketEditMethod {
        this.categoryId = categoryId
        return this
    }

    fun setPrice(price: Double): MarketEditMethod {
        this.price = price
        return this
    }

    fun setDeleted(deleted: Boolean): MarketEditMethod {
        this.deleted = deleted
        return this
    }

    fun setMainPhotoId(mainPhotoId: Long): MarketEditMethod {
        this.mainPhotoId = mainPhotoId
        return this
    }

    fun setPhotoIds(photoIds: Array<Long>): MarketEditMethod {
        this.photoIds = photoIds
        return this
    }

    override val classRef = MarketEditMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
