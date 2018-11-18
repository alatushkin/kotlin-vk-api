package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.photos.Photo

/**
 *  Returns information about photos by their IDs.
 *
 *  [https://vk.com/dev/photos.getById]
 *  @property [photos] IDs separated with a comma, that are IDs of users who posted photos and IDs of photos themselves with an underscore character between such IDs. To get information about a photo in the group album, you shall specify group ID instead of user ID. Example: "1_129207899,6492_135055734, , -20629724_271945303"
 *  @property [photo_sizes] '1' — to return photo sizes in a
 */
class PhotosGetByIdMethod() : VkMethod<Array<Photo>>(
    "photos.getById",
    mutableMapOf()
) {

    var photos: Array<String>? by props
    var photoSizes: Boolean? by props

    constructor(
        photos: Array<String>? = null,
        photoSizes: Boolean? = null
    ) : this() {
        this.photos = photos
        this.photoSizes = photoSizes
    }

    fun setPhotos(photos: Array<String>): PhotosGetByIdMethod {
        this.photos = photos
        return this
    }

    fun setPhotoSizes(photoSizes: Boolean): PhotosGetByIdMethod {
        this.photoSizes = photoSizes
        return this
    }

    override val classRef = PhotosGetByIdMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Array<Photo>>>() {}
    }
}
