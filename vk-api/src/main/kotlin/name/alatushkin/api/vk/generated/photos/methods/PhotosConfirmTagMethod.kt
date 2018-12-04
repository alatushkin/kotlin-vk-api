@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.confirmTag]
 *
 * Confirms a tag on a photo.
 *
 * @property ownerId ID of the user or community that owns the photo.
 * @property photoId Photo ID.
 * @property tagId Tag ID.
 */
class PhotosConfirmTagMethod(
        ownerId: Long? = null,
        photoId: String,
        tagId: Long
) : VkMethod<Boolean>(
    "photos.confirmTag",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserMethod {

    var ownerId: Long? by props
    var photoId: String by props
    var tagId: Long by props

    init {
        this.ownerId = ownerId
        this.photoId = photoId
        this.tagId = tagId
    }

    fun setOwnerId(ownerId: Long): PhotosConfirmTagMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPhotoId(photoId: String): PhotosConfirmTagMethod {
        this.photoId = photoId
        return this
    }

    fun setTagId(tagId: Long): PhotosConfirmTagMethod {
        this.tagId = tagId
        return this
    }
}
