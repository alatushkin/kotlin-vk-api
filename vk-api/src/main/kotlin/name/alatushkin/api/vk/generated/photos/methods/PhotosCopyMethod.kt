package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Allows to copy a photo to the "Saved photos" album
 *
 *  [https://vk.com/dev/photos.copy]
 *  @property [owner_id] photo's owner ID
 *  @property [photo_id] photo ID
 *  @property [access_key] for private photos
 */
class PhotosCopyMethod() : VkMethod<Long>(
    "photos.copy",
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

    fun setOwnerId(ownerId: Long): PhotosCopyMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPhotoId(photoId: Long): PhotosCopyMethod {
        this.photoId = photoId
        return this
    }

    fun setAccessKey(accessKey: String): PhotosCopyMethod {
        this.accessKey = accessKey
        return this
    }

    override val classRef = PhotosCopyMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Long>>() {}
    }
}
