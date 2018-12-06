@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.photos.PhotoUpload
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var groupId: Long? by props

    init {
        this.groupId = groupId
    }
}
