@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.makeCover]
 *
 * Makes a photo into an album cover.
 *
 * @property ownerId ID of the user or community that owns the photo.
 * @property photoId Photo ID.
 * @property albumId Album ID.
 */
class PhotosMakeCoverMethod(
    ownerId: Long? = null,
    photoId: Long,
    albumId: Long? = null
) : VkMethod<Boolean>(
    "photos.makeCover",
    mutableMapOf(),
    successReference()
), UserMethod {

    var ownerId: Long? by props
    var photoId: Long by props
    var albumId: Long? by props

    init {
        this.ownerId = ownerId
        this.photoId = photoId
        this.albumId = albumId
    }
}
