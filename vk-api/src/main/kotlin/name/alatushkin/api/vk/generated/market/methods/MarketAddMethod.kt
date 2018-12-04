package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.market.AddResponse

/**
 *  Ads a new item to the market.
 *
 *  [https://vk.com/dev/market.add]
 *  @property [owner_id] ID of an item owner community.
 *  @property [name] Item name.
 *  @property [description] Item description.
 *  @property [category_id] Item category ID.
 *  @property [price] Item price.
 *  @property [deleted] Item status ('1' — deleted, '0' — not deleted).
 *  @property [main_photo_id] Cover photo ID.
 *  @property [photo_ids] IDs of additional photos.
 */
class MarketAddMethod() : VkMethod<AddResponse>(
    "market.add",
    HashMap()
) {

    var ownerId: Long? by props
    var name: String? by props
    var description: String? by props
    var categoryId: Long? by props
    var price: Double? by props
    var deleted: Boolean? by props
    var mainPhotoId: Long? by props
    var photoIds: Array<Long>? by props

    constructor(
        ownerId: Long? = null,
        name: String? = null,
        description: String? = null,
        categoryId: Long? = null,
        price: Double? = null,
        deleted: Boolean? = null,
        mainPhotoId: Long? = null,
        photoIds: Array<Long>? = null
    ) : this() {
        this.ownerId = ownerId
        this.name = name
        this.description = description
        this.categoryId = categoryId
        this.price = price
        this.deleted = deleted
        this.mainPhotoId = mainPhotoId
        this.photoIds = photoIds
    }

    fun setOwnerId(ownerId: Long): MarketAddMethod {
        this.ownerId = ownerId
        return this
    }

    fun setName(name: String): MarketAddMethod {
        this.name = name
        return this
    }

    fun setDescription(description: String): MarketAddMethod {
        this.description = description
        return this
    }

    fun setCategoryId(categoryId: Long): MarketAddMethod {
        this.categoryId = categoryId
        return this
    }

    fun setPrice(price: Double): MarketAddMethod {
        this.price = price
        return this
    }

    fun setDeleted(deleted: Boolean): MarketAddMethod {
        this.deleted = deleted
        return this
    }

    fun setMainPhotoId(mainPhotoId: Long): MarketAddMethod {
        this.mainPhotoId = mainPhotoId
        return this
    }

    fun setPhotoIds(photoIds: Array<Long>): MarketAddMethod {
        this.photoIds = photoIds
        return this
    }

    override val classRef = MarketAddMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<AddResponse>>() {}
    }
}
