package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.common.UploadServer

/**
 *  Returns the server address for owner cover upload.
 *
 *  [https://vk.com/dev/photos.getOwnerCoverPhotoUploadServer]
 *  @property [group_id] ID of community that owns the album (if the photo will be uploaded to a community album).
 *  @property [crop_x] X coordinate of the left-upper corner
 *  @property [crop_y] Y coordinate of the left-upper corner
 *  @property [crop_x2] X coordinate of the right-bottom corner
 *  @property [crop_y2] Y coordinate of the right-bottom corner
 */
class PhotosGetOwnerCoverPhotoUploadServerMethod() : VkMethod<UploadServer>(
    "photos.getOwnerCoverPhotoUploadServer",
    HashMap()
) {

    var groupId: Long? by props
    var cropX: Long? by props
    var cropY: Long? by props
    var cropX2: Long? by props
    var cropY2: Long? by props

    constructor(
        groupId: Long? = null,
        cropX: Long? = null,
        cropY: Long? = null,
        cropX2: Long? = null,
        cropY2: Long? = null
    ) : this() {
        this.groupId = groupId
        this.cropX = cropX
        this.cropY = cropY
        this.cropX2 = cropX2
        this.cropY2 = cropY2
    }

    fun setGroupId(groupId: Long): PhotosGetOwnerCoverPhotoUploadServerMethod {
        this.groupId = groupId
        return this
    }

    fun setCropX(cropX: Long): PhotosGetOwnerCoverPhotoUploadServerMethod {
        this.cropX = cropX
        return this
    }

    fun setCropY(cropY: Long): PhotosGetOwnerCoverPhotoUploadServerMethod {
        this.cropY = cropY
        return this
    }

    fun setCropX2(cropX2: Long): PhotosGetOwnerCoverPhotoUploadServerMethod {
        this.cropX2 = cropX2
        return this
    }

    fun setCropY2(cropY2: Long): PhotosGetOwnerCoverPhotoUploadServerMethod {
        this.cropY2 = cropY2
        return this
    }

    override val classRef = PhotosGetOwnerCoverPhotoUploadServerMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<UploadServer>>() {}
    }
}
