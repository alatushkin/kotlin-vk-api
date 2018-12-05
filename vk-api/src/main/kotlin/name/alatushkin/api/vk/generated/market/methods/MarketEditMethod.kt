@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/market.edit]
 *
 * Edits an item.
 *
 * @property ownerId ID of an item owner community.
 * @property itemId Item ID.
 * @property name Item name.
 * @property description Item description.
 * @property categoryId Item category ID.
 * @property price Item price.
 * @property deleted Item status ('1' — deleted, '0' — not deleted).
 * @property mainPhotoId Cover photo ID.
 * @property photoIds IDs of additional photos.
 */
class MarketEditMethod(
        ownerId: Long,
        itemId: Long,
        name: String,
        description: String,
        categoryId: Long,
        price: Double,
        deleted: Boolean? = null,
        mainPhotoId: Long,
        photoIds: Array<Long>? = null
) : VkMethod<Boolean>(
    "market.edit",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var ownerId: Long by props
    var itemId: Long by props
    var name: String by props
    var description: String by props
    var categoryId: Long by props
    var price: Double by props
    var deleted: Boolean? by props
    var mainPhotoId: Long by props
    var photoIds: Array<Long>? by props

    init {
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
}
