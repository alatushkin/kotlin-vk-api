@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.copy]
 *
 * Allows to copy a photo to the "Saved photos" album
 *
 * @property ownerId photo's owner ID
 * @property photoId photo ID
 * @property accessKey for private photos
 */
class PhotosCopyMethod(
        ownerId: Long,
        photoId: Long,
        accessKey: String? = null
) : VkMethod<Long>(
    "photos.copy",
    mutableMapOf(),
    object : TypeReference<VkResponse<Long>>() {}
), UserMethod {

    var ownerId: Long by props
    var photoId: Long by props
    var accessKey: String? by props

    init {
        this.ownerId = ownerId
        this.photoId = photoId
        this.accessKey = accessKey
    }

    fun setOwnerId(ownerId: Long): PhotosCopyMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPhotoId(photoId: Long): PhotosCopyMethod {
        this.photoId = photoId
        return this
    }

    fun setAccessKey(accessKey: String): PhotosCopyMethod {
        this.accessKey = accessKey
        return this
    }
}
