@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.photos.PhotoTag
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.getTags]
 *
 * Returns a list of tags on a photo.
 *
 * @property ownerId ID of the user or community that owns the photo.
 * @property photoId Photo ID.
 * @property accessKey 
 */
class PhotosGetTagsMethod(
        ownerId: Long? = null,
        photoId: Long,
        accessKey: String? = null
) : VkMethod<Array<PhotoTag>>(
    "photos.getTags",
    mutableMapOf(),
    object : TypeReference<VkResponse<Array<PhotoTag>>>() {}
), UserMethod {

    var ownerId: Long? by props
    var photoId: Long by props
    var accessKey: String? by props

    init {
        this.ownerId = ownerId
        this.photoId = photoId
        this.accessKey = accessKey
    }

    fun setOwnerId(ownerId: Long): PhotosGetTagsMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPhotoId(photoId: Long): PhotosGetTagsMethod {
        this.photoId = photoId
        return this
    }

    fun setAccessKey(accessKey: String): PhotosGetTagsMethod {
        this.accessKey = accessKey
        return this
    }
}
