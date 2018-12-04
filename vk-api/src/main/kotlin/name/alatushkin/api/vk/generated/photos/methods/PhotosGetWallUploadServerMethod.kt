package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.photos.PhotoUpload

/**
 *  Returns the server address for photo upload onto a user's wall.
 *
 *  [https://vk.com/dev/photos.getWallUploadServer]
 *  @property [group_id] ID of community to whose wall the photo will be uploaded.
 */
class PhotosGetWallUploadServerMethod() : VkMethod<PhotoUpload>(
    "photos.getWallUploadServer",
    HashMap()
) {

    var groupId: Long? by props

    constructor(
        groupId: Long? = null
    ) : this() {
        this.groupId = groupId
    }

    fun setGroupId(groupId: Long): PhotosGetWallUploadServerMethod {
        this.groupId = groupId
        return this
    }

    override val classRef = PhotosGetWallUploadServerMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<PhotoUpload>>() {}
    }
}
