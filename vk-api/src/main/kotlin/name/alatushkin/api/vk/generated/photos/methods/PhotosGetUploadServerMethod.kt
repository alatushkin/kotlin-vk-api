@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.photos.PhotoUpload
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.getUploadServer]
 *
 * Returns the server address for photo upload.
 *
 * @property albumId Album ID.
 * @property groupId ID of community that owns the album (if the photo will be uploaded to a community album).
 */
class PhotosGetUploadServerMethod(
    albumId: Long? = null,
    groupId: Long? = null
) : VkMethod<PhotoUpload>(
    "photos.getUploadServer",
    mutableMapOf(),
    successReference()
), UserMethod {

    var albumId: Long? by props
    var groupId: Long? by props

    init {
        this.albumId = albumId
        this.groupId = groupId
    }
}
