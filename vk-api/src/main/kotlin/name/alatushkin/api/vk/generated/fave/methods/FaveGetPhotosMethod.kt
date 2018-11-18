package name.alatushkin.api.vk.generated.fave.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.photos.Photo

/**
 *  Returns a list of photos that the current user has liked.
 *
 *  [https://vk.com/dev/fave.getPhotos]
 *  @property [offset] Offset needed to return a specific subset of photos.
 *  @property [count] Number of photos to return.
 *  @property [photo_sizes] '1' — to return photo sizes in a [vk.com/dev/photo_sizes|special format].
 */
class FaveGetPhotosMethod() : VkMethod<VkList<Photo>>(
    "fave.getPhotos",
    HashMap()
) {

    var offset: Long? by props
    var count: Long? by props
    var photoSizes: Boolean? by props

    constructor(
        offset: Long? = null,
        count: Long? = null,
        photoSizes: Boolean? = null
    ) : this() {
        this.offset = offset
        this.count = count
        this.photoSizes = photoSizes
    }

    fun setOffset(offset: Long): FaveGetPhotosMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): FaveGetPhotosMethod {
        this.count = count
        return this
    }

    fun setPhotoSizes(photoSizes: Boolean): FaveGetPhotosMethod {
        this.photoSizes = photoSizes
        return this
    }

    override val classRef = FaveGetPhotosMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<Photo>>>() {}
    }
}
