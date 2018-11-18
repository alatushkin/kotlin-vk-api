package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Removes a tag from a photo.
 *
 *  [https://vk.com/dev/photos.removeTag]
 *  @property [owner_id] ID of the user or community that owns the photo.
 *  @property [photo_id] Photo ID.
 *  @property [tag_id] Tag ID.
 */
class PhotosRemoveTagMethod() : VkMethod<Boolean>(
    "photos.removeTag",
    HashMap()
) {

    var ownerId: Long? by props
    var photoId: Long? by props
    var tagId: Long? by props

    constructor(
        ownerId: Long? = null,
        photoId: Long? = null,
        tagId: Long? = null
    ) : this() {
        this.ownerId = ownerId
        this.photoId = photoId
        this.tagId = tagId
    }

    fun setOwnerId(ownerId: Long): PhotosRemoveTagMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPhotoId(photoId: Long): PhotosRemoveTagMethod {
        this.photoId = photoId
        return this
    }

    fun setTagId(tagId: Long): PhotosRemoveTagMethod {
        this.tagId = tagId
        return this
    }

    override val classRef = PhotosRemoveTagMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
