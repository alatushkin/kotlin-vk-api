package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.common.UploadServer

/**
 *  Returns the server address for market photo upload.
 *
 *  [https://vk.com/dev/photos.getMarketUploadServer]
 *  @property [group_id] Community ID.
 *  @property [main_photo] '1' if you want to upload the main item photo.
 *  @property [crop_x] X coordinate of the crop left upper corner.
 *  @property [crop_y] Y coordinate of the crop left upper corner.
 *  @property [crop_width] Width of the cropped photo in px.
 */
class PhotosGetMarketUploadServerMethod() : VkMethod<UploadServer>(
    "photos.getMarketUploadServer",
    HashMap()
) {

    var groupId: Long? by props
    var mainPhoto: Boolean? by props
    var cropX: Long? by props
    var cropY: Long? by props
    var cropWidth: Long? by props

    constructor(
        groupId: Long? = null,
        mainPhoto: Boolean? = null,
        cropX: Long? = null,
        cropY: Long? = null,
        cropWidth: Long? = null
    ) : this() {
        this.groupId = groupId
        this.mainPhoto = mainPhoto
        this.cropX = cropX
        this.cropY = cropY
        this.cropWidth = cropWidth
    }

    fun setGroupId(groupId: Long): PhotosGetMarketUploadServerMethod {
        this.groupId = groupId
        return this
    }

    fun setMainPhoto(mainPhoto: Boolean): PhotosGetMarketUploadServerMethod {
        this.mainPhoto = mainPhoto
        return this
    }

    fun setCropX(cropX: Long): PhotosGetMarketUploadServerMethod {
        this.cropX = cropX
        return this
    }

    fun setCropY(cropY: Long): PhotosGetMarketUploadServerMethod {
        this.cropY = cropY
        return this
    }

    fun setCropWidth(cropWidth: Long): PhotosGetMarketUploadServerMethod {
        this.cropWidth = cropWidth
        return this
    }

    override val classRef = PhotosGetMarketUploadServerMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<UploadServer>>() {}
    }
}
