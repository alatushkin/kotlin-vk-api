package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Makes a photo into an album cover.
 *
 *  [https://vk.com/dev/photos.makeCover]
 *  @property [owner_id] ID of the user or community that owns the photo.
 *  @property [photo_id] Photo ID.
 *  @property [album_id] Album ID.
 */
class PhotosMakeCoverMethod() : VkMethod<Boolean>(
    "photos.makeCover",
    HashMap()
) {

    var ownerId: Long? by props
    var photoId: Long? by props
    var albumId: Long? by props

    constructor(
        ownerId: Long? = null,
        photoId: Long? = null,
        albumId: Long? = null
    ) : this() {
        this.ownerId = ownerId
        this.photoId = photoId
        this.albumId = albumId
    }

    fun setOwnerId(ownerId: Long): PhotosMakeCoverMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPhotoId(photoId: Long): PhotosMakeCoverMethod {
        this.photoId = photoId
        return this
    }

    fun setAlbumId(albumId: Long): PhotosMakeCoverMethod {
        this.albumId = albumId
        return this
    }

    override val classRef = PhotosMakeCoverMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
