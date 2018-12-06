@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.common.UploadServer
import name.alatushkin.api.vk.successReference
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
    successReference()
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
}
