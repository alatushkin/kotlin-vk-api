package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.photos.SaveOwnerPhotoResponse

/**
 *  Saves a profile or community photo. Upload URL can be got with the [vk.com/dev/photos.getOwnerPhotoUploadServer|photos.getOwnerPhotoUploadServer] method.
 *
 *  [https://vk.com/dev/photos.saveOwnerPhoto]
 *  @property [server] parameter returned after [vk.com/dev/upload_files|photo upload].
 *  @property [hash] parameter returned after [vk.com/dev/upload_files|photo upload].
 *  @property [photo] parameter returned after [vk.com/dev/upload_files|photo upload].
 */
class PhotosSaveOwnerPhotoMethod() : VkMethod<SaveOwnerPhotoResponse>(
    "photos.saveOwnerPhoto",
    HashMap()
) {

    var server: String? by props
    var hash: String? by props
    var photo: String? by props

    constructor(
        server: String? = null,
        hash: String? = null,
        photo: String? = null
    ) : this() {
        this.server = server
        this.hash = hash
        this.photo = photo
    }

    fun setServer(server: String): PhotosSaveOwnerPhotoMethod {
        this.server = server
        return this
    }

    fun setHash(hash: String): PhotosSaveOwnerPhotoMethod {
        this.hash = hash
        return this
    }

    fun setPhoto(photo: String): PhotosSaveOwnerPhotoMethod {
        this.photo = photo
        return this
    }

    override val classRef = PhotosSaveOwnerPhotoMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<SaveOwnerPhotoResponse>>() {}
    }
}
