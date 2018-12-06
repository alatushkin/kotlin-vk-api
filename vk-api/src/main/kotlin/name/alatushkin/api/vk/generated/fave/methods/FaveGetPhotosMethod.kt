@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.fave.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.photos.Photo
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/fave.getPhotos]
 *
 * Returns a list of photos that the current user has liked.
 *
 * @property offset Offset needed to return a specific subset of photos.
 * @property count Number of photos to return.
 * @property photoSizes '1' — to return photo sizes in a [vk.com/dev/photo_sizes|special format].
 */
class FaveGetPhotosMethod(
    offset: Long? = null,
    count: Long? = null,
    photoSizes: Boolean? = null
) : VkMethod<VkList<Photo>>(
    "fave.getPhotos",
    mutableMapOf(),
    successReference()
), UserMethod {

    var offset: Long? by props
    var count: Long? by props
    var photoSizes: Boolean? by props

    init {
        this.offset = offset
        this.count = count
        this.photoSizes = photoSizes
    }
}
