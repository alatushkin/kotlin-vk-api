@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.common.UploadServer
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/photos.getOwnerCoverPhotoUploadServer]
 *
 * Returns the server address for owner cover upload.
 *
 * @property groupId ID of community that owns the album (if the photo will be uploaded to a community album).
 * @property cropX X coordinate of the left-upper corner
 * @property cropY Y coordinate of the left-upper corner
 * @property cropX2 X coordinate of the right-bottom corner
 * @property cropY2 Y coordinate of the right-bottom corner
 */
class PhotosGetOwnerCoverPhotoUploadServerMethod(
        groupId: Long? = null,
        cropX: Long? = null,
        cropY: Long? = null,
        cropX2: Long? = null,
        cropY2: Long? = null
) : VkMethod<UploadServer>(
    "photos.getOwnerCoverPhotoUploadServer",
    mutableMapOf(),
    object : TypeReference<VkResponse<UploadServer>>() {}
), UserGroupMethod {

    var groupId: Long? by props
    var cropX: Long? by props
    var cropY: Long? by props
    var cropX2: Long? by props
    var cropY2: Long? by props

    init {
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
}
