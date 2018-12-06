@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var ownerId: Long? by props
    var photoId: Long by props

    init {
        this.ownerId = ownerId
        this.photoId = photoId
    }
}
