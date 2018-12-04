@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.delete]
 *
 * Deletes a photo.
 *
 * @property ownerId ID of the user or community that owns the photo.
 * @property photoId Photo ID.
 */
class PhotosDeleteMethod(
        ownerId: Long? = null,
        photoId: Long
) : VkMethod<Boolean>(
    "photos.delete",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserMethod {

    var ownerId: Long? by props
    var photoId: Long by props

    init {
        this.ownerId = ownerId
        this.photoId = photoId
    }

    fun setOwnerId(ownerId: Long): PhotosDeleteMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPhotoId(photoId: Long): PhotosDeleteMethod {
        this.photoId = photoId
        return this
    }
}
