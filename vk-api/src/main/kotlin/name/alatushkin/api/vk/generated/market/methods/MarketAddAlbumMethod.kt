package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.market.AddAlbumResponse

/**
 *  Creates new collection of items
 *
 *  [https://vk.com/dev/market.addAlbum]
 *  @property [owner_id] ID of an item owner community.
 *  @property [title] Collection title.
 *  @property [photo_id] Cover photo ID.
 *  @property [main_album] Set as main ('1' – set, '0' – no).
 */
class MarketAddAlbumMethod() : VkMethod<AddAlbumResponse>(
    "market.addAlbum",
    HashMap()
) {

    var ownerId: Long? by props
    var title: String? by props
    var photoId: Long? by props
    var mainAlbum: Boolean? by props

    constructor(
        ownerId: Long? = null,
        title: String? = null,
        photoId: Long? = null,
        mainAlbum: Boolean? = null
    ) : this() {
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

    override val classRef = MarketAddAlbumMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<AddAlbumResponse>>() {}
    }
}
