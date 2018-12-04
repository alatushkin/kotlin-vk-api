package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Reorders the photo in the list of photos of the user album.
 *
 *  [https://vk.com/dev/photos.reorderPhotos]
 *  @property [owner_id] ID of the user or community that owns the photo.
 *  @property [photo_id] Photo ID.
 *  @property [before] ID of the photo before which the photo in question shall be placed.
 *  @property [after] ID of the photo after which the photo in question shall be placed.
 */
class PhotosReorderPhotosMethod() : VkMethod<Boolean>(
    "photos.reorderPhotos",
    HashMap()
) {

    var ownerId: Long? by props
    var photoId: Long? by props
    var before: Long? by props
    var after: Long? by props

    constructor(
        ownerId: Long? = null,
        photoId: Long? = null,
        before: Long? = null,
        after: Long? = null
    ) : this() {
        this.ownerId = ownerId
        this.photoId = photoId
        this.before = before
        this.after = after
    }

    fun setOwnerId(ownerId: Long): PhotosReorderPhotosMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPhotoId(photoId: Long): PhotosReorderPhotosMethod {
        this.photoId = photoId
        return this
    }

    fun setBefore(before: Long): PhotosReorderPhotosMethod {
        this.before = before
        return this
    }

    fun setAfter(after: Long): PhotosReorderPhotosMethod {
        this.after = after
        return this
    }

    override val classRef = PhotosReorderPhotosMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
