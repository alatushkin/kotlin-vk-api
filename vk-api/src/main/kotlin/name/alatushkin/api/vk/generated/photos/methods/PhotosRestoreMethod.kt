@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.restore]
 *
 * Restores a deleted photo.
 *
 * @property ownerId ID of the user or community that owns the photo.
 * @property photoId Photo ID.
 */
class PhotosRestoreMethod(
        ownerId: Long? = null,
        photoId: Long
) : VkMethod<Boolean>(
    "photos.restore",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var ownerId: Long? by props
    var photoId: Long by props

    init {
        this.ownerId = ownerId
        this.photoId = photoId
    }

    fun setOwnerId(ownerId: Long): PhotosRestoreMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPhotoId(photoId: Long): PhotosRestoreMethod {
        this.photoId = photoId
        return this
    }
}
