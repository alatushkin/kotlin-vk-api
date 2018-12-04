package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.common.UploadServer

/**
 *  Returns an upload server address for a profile or community photo.
 *
 *  [https://vk.com/dev/photos.getOwnerPhotoUploadServer]
 *  @property [owner_id] identifier of a community or current user. "Note that community id must be negative. 'owner_id=1' – user, 'owner_id=-1' – community, "
 */
class PhotosGetOwnerPhotoUploadServerMethod() : VkMethod<UploadServer>(
    "photos.getOwnerPhotoUploadServer",
    HashMap()
) {

    var ownerId: Long? by props

    constructor(
        ownerId: Long? = null
    ) : this() {
        this.ownerId = ownerId
    }

    fun setOwnerId(ownerId: Long): PhotosGetOwnerPhotoUploadServerMethod {
        this.ownerId = ownerId
        return this
    }

    override val classRef = PhotosGetOwnerPhotoUploadServerMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<UploadServer>>() {}
    }
}
