package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.photos.Photo

/**
 *  Saves a photo after being successfully uploaded. URL obtained with [vk.com/dev/photos.getMessagesUploadServer|photos.getMessagesUploadServer] method.
 *
 *  [https://vk.com/dev/photos.saveMessagesPhoto]
 *  @property [photo] Parameter returned when the photo is [vk.com/dev/upload_files|uploaded to the server].
 *  @property [server]
 *  @property [hash]
 */
class PhotosSaveMessagesPhotoMethod() : VkMethod<Array<Photo>>(
    "photos.saveMessagesPhoto",
    HashMap()
) {

    var photo: String? by props
    var server: Long? by props
    var hash: String? by props

    constructor(
        photo: String? = null,
        server: Long? = null,
        hash: String? = null
    ) : this() {
        this.photo = photo
        this.server = server
        this.hash = hash
    }

    fun setPhoto(photo: String): PhotosSaveMessagesPhotoMethod {
        this.photo = photo
        return this
    }

    fun setServer(server: Long): PhotosSaveMessagesPhotoMethod {
        this.server = server
        return this
    }

    fun setHash(hash: String): PhotosSaveMessagesPhotoMethod {
        this.hash = hash
        return this
    }

    override val classRef = PhotosSaveMessagesPhotoMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Array<Photo>>>() {}
    }
}
