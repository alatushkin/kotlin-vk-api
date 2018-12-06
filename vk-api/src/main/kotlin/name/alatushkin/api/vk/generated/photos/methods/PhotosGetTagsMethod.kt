@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.photos.PhotoTag
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var ownerId: Long? by props
    var photoId: Long by props
    var accessKey: String? by props

    init {
        this.ownerId = ownerId
        this.photoId = photoId
        this.accessKey = accessKey
    }
}
