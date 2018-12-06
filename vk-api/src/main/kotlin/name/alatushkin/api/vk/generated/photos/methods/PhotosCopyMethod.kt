@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var ownerId: Long by props
    var photoId: Long by props
    var accessKey: String? by props

    init {
        this.ownerId = ownerId
        this.photoId = photoId
        this.accessKey = accessKey
    }
}
