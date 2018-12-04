package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.common.Image

/**
 *  Saves cover photo after successful uploading.
 *
 *  [https://vk.com/dev/photos.saveOwnerCoverPhoto]
 *  @property [photo] Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 *  @property [hash] Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 */
class PhotosSaveOwnerCoverPhotoMethod() : VkMethod<Array<Image>>(
    "photos.saveOwnerCoverPhoto",
    HashMap()
) {

    var photo: String? by props
    var hash: String? by props

    constructor(
        photo: String? = null,
        hash: String? = null
    ) : this() {
        this.photo = photo
        this.hash = hash
    }

    fun setPhoto(photo: String): PhotosSaveOwnerCoverPhotoMethod {
        this.photo = photo
        return this
    }

    fun setHash(hash: String): PhotosSaveOwnerCoverPhotoMethod {
        this.hash = hash
        return this
    }

    override val classRef = PhotosSaveOwnerCoverPhotoMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Array<Image>>>() {}
    }
}
