package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Edits a collection of items
 *
 *  [https://vk.com/dev/market.editAlbum]
 *  @property [owner_id] ID of an collection owner community.
 *  @property [album_id] Collection ID.
 *  @property [title] Collection title.
 *  @property [photo_id] Cover photo id
 *  @property [main_album] Set as main ('1' – set, '0' – no).
 */
class MarketEditAlbumMethod() : VkMethod<Boolean>(
    "market.editAlbum",
    HashMap()
) {

    var ownerId: Long? by props
    var albumId: Long? by props
    var title: String? by props
    var photoId: Long? by props
    var mainAlbum: Boolean? by props

    constructor(
        ownerId: Long? = null,
        albumId: Long? = null,
        title: String? = null,
        photoId: Long? = null,
        mainAlbum: Boolean? = null
    ) : this() {
        this.ownerId = ownerId
        this.albumId = albumId
        this.title = title
        this.photoId = photoId
        this.mainAlbum = mainAlbum
    }

    fun setOwnerId(ownerId: Long): MarketEditAlbumMethod {
        this.ownerId = ownerId
        return this
    }

    fun setAlbumId(albumId: Long): MarketEditAlbumMethod {
        this.albumId = albumId
        return this
    }

    fun setTitle(title: String): MarketEditAlbumMethod {
        this.title = title
        return this
    }

    fun setPhotoId(photoId: Long): MarketEditAlbumMethod {
        this.photoId = photoId
        return this
    }

    fun setMainAlbum(mainAlbum: Boolean): MarketEditAlbumMethod {
        this.mainAlbum = mainAlbum
        return this
    }

    override val classRef = MarketEditAlbumMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
