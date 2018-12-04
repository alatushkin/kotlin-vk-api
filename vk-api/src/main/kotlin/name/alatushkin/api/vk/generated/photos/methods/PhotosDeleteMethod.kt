package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Deletes a photo.
 *
 *  [https://vk.com/dev/photos.delete]
 *  @property [owner_id] ID of the user or community that owns the photo.
 *  @property [photo_id] Photo ID.
 */
class PhotosDeleteMethod() : VkMethod<Boolean>(
    "photos.delete",
    HashMap()
) {

    var ownerId: Long? by props
    var photoId: Long? by props

    constructor(
        ownerId: Long? = null,
        photoId: Long? = null
    ) : this() {
        this.ownerId = ownerId
        this.photoId = photoId
    }

    fun setOwnerId(ownerId: Long): PhotosDeleteMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPhotoId(photoId: Long): PhotosDeleteMethod {
        this.photoId = photoId
        return this
    }

    override val classRef = PhotosDeleteMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
