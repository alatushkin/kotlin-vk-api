@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.market.AddAlbumResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/market.addAlbum]
 *
 * Creates new collection of items
 *
 * @property ownerId ID of an item owner community.
 * @property title Collection title.
 * @property photoId Cover photo ID.
 * @property mainAlbum Set as main ('1' – set, '0' – no).
 */
class MarketAddAlbumMethod(
        ownerId: Long,
        title: String,
        photoId: Long? = null,
        mainAlbum: Boolean? = null
) : VkMethod<AddAlbumResponse>(
    "market.addAlbum",
    mutableMapOf(),
    object : TypeReference<VkSuccess<AddAlbumResponse>>() {}
), UserMethod {

    var ownerId: Long by props
    var title: String by props
    var photoId: Long? by props
    var mainAlbum: Boolean? by props

    init {
        this.ownerId = ownerId
        this.title = title
        this.photoId = photoId
        this.mainAlbum = mainAlbum
    }

    fun setOwnerId(ownerId: Long): MarketAddAlbumMethod {
        this.ownerId = ownerId
        return this
    }

    fun setTitle(title: String): MarketAddAlbumMethod {
        this.title = title
        return this
    }

    fun setPhotoId(photoId: Long): MarketAddAlbumMethod {
        this.photoId = photoId
        return this
    }

    fun setMainAlbum(mainAlbum: Boolean): MarketAddAlbumMethod {
        this.mainAlbum = mainAlbum
        return this
    }
}
