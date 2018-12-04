package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.photos.PhotoTag

/**
 *  Returns a list of tags on a photo.
 *
 *  [https://vk.com/dev/photos.getTags]
 *  @property [owner_id] ID of the user or community that owns the photo.
 *  @property [photo_id] Photo ID.
 *  @property [access_key]
 */
class PhotosGetTagsMethod() : VkMethod<Array<PhotoTag>>(
    "photos.getTags",
    HashMap()
) {

    var ownerId: Long? by props
    var photoId: Long? by props
    var accessKey: String? by props

    constructor(
        ownerId: Long? = null,
        photoId: Long? = null,
        accessKey: String? = null
    ) : this() {
        this.ownerId = ownerId
        this.photoId = photoId
        this.accessKey = accessKey
    }

    fun setOwnerId(ownerId: Long): PhotosGetTagsMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPhotoId(photoId: Long): PhotosGetTagsMethod {
        this.photoId = photoId
        return this
    }

    fun setAccessKey(accessKey: String): PhotosGetTagsMethod {
        this.accessKey = accessKey
        return this
    }

    override val classRef = PhotosGetTagsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Array<PhotoTag>>>() {}
    }
}
