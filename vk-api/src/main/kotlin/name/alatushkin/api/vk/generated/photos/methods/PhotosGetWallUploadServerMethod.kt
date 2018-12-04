@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.photos.PhotoUpload
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.getWallUploadServer]
 *
 * Returns the server address for photo upload onto a user's wall.
 *
 * @property groupId ID of community to whose wall the photo will be uploaded.
 */
class PhotosGetWallUploadServerMethod(
        groupId: Long? = null
) : VkMethod<PhotoUpload>(
    "photos.getWallUploadServer",
    mutableMapOf(),
    object : TypeReference<VkSuccess<PhotoUpload>>() {}
), UserMethod {

    var groupId: Long? by props

    init {
        this.groupId = groupId
    }

    fun setGroupId(groupId: Long): PhotosGetWallUploadServerMethod {
        this.groupId = groupId
        return this
    }
}
