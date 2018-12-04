package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Confirms a tag on a photo.
 *
 *  [https://vk.com/dev/photos.confirmTag]
 *  @property [owner_id] ID of the user or community that owns the photo.
 *  @property [photo_id] Photo ID.
 *  @property [tag_id] Tag ID.
 */
class PhotosConfirmTagMethod() : VkMethod<Boolean>(
    "photos.confirmTag",
    HashMap()
) {

    var ownerId: Long? by props
    var photoId: String? by props
    var tagId: Long? by props

    constructor(
        ownerId: Long? = null,
        photoId: String? = null,
        tagId: Long? = null
    ) : this() {
        this.ownerId = ownerId
        this.photoId = photoId
        this.tagId = tagId
    }

    fun setOwnerId(ownerId: Long): PhotosConfirmTagMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPhotoId(photoId: String): PhotosConfirmTagMethod {
        this.photoId = photoId
        return this
    }

    fun setTagId(tagId: Long): PhotosConfirmTagMethod {
        this.tagId = tagId
        return this
    }

    override val classRef = PhotosConfirmTagMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
