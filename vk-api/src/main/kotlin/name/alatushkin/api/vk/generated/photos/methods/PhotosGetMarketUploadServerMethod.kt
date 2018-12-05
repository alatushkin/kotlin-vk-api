@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.common.UploadServer
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.getMarketUploadServer]
 *
 * Returns the server address for market photo upload.
 *
 * @property groupId Community ID.
 * @property mainPhoto '1' if you want to upload the main item photo.
 * @property cropX X coordinate of the crop left upper corner.
 * @property cropY Y coordinate of the crop left upper corner.
 * @property cropWidth Width of the cropped photo in px.
 */
class PhotosGetMarketUploadServerMethod(
        groupId: Long,
        mainPhoto: Boolean? = null,
        cropX: Long? = null,
        cropY: Long? = null,
        cropWidth: Long? = null
) : VkMethod<UploadServer>(
    "photos.getMarketUploadServer",
    mutableMapOf(),
    object : TypeReference<VkResponse<UploadServer>>() {}
), UserMethod {

    var groupId: Long by props
    var mainPhoto: Boolean? by props
    var cropX: Long? by props
    var cropY: Long? by props
    var cropWidth: Long? by props

    init {
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
}
