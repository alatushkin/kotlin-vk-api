@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.market.AddResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/market.add]
 *
 * Ads a new item to the market.
 *
 * @property ownerId ID of an item owner community.
 * @property name Item name.
 * @property description Item description.
 * @property categoryId Item category ID.
 * @property price Item price.
 * @property deleted Item status ('1' — deleted, '0' — not deleted).
 * @property mainPhotoId Cover photo ID.
 * @property photoIds IDs of additional photos.
 */
class MarketAddMethod(
        ownerId: Long,
        name: String,
        description: String,
        categoryId: Long,
        price: Double,
        deleted: Boolean? = null,
        mainPhotoId: Long,
        photoIds: Array<Long>? = null
) : VkMethod<AddResponse>(
    "market.add",
    mutableMapOf(),
    object : TypeReference<VkSuccess<AddResponse>>() {}
), UserMethod {

    var ownerId: Long by props
    var name: String by props
    var description: String by props
    var categoryId: Long by props
    var price: Double by props
    var deleted: Boolean? by props
    var mainPhotoId: Long by props
    var photoIds: Array<Long>? by props

    init {
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
}
