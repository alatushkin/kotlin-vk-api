@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.move]
 *
 * Moves a photo from one album to another.
 *
 * @property ownerId ID of the user or community that owns the photo.
 * @property targetAlbumId ID of the album to which the photo will be moved.
 * @property photoId Photo ID.
 */
class PhotosMoveMethod(
        ownerId: Long? = null,
        targetAlbumId: Long,
        photoId: Long
) : VkMethod<Boolean>(
    "photos.move",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserMethod {

    var ownerId: Long? by props
    var targetAlbumId: Long by props
    var photoId: Long by props

    init {
        this.ownerId = ownerId
        this.targetAlbumId = targetAlbumId
        this.photoId = photoId
    }

    fun setOwnerId(ownerId: Long): PhotosMoveMethod {
        this.ownerId = ownerId
        return this
    }

    fun setTargetAlbumId(targetAlbumId: Long): PhotosMoveMethod {
        this.targetAlbumId = targetAlbumId
        return this
    }

    fun setPhotoId(photoId: Long): PhotosMoveMethod {
        this.photoId = photoId
        return this
    }
}
