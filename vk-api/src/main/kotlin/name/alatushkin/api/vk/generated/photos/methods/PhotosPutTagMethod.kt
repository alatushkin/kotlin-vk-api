@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.putTag]
 *
 * Adds a tag on the photo.
 *
 * @property ownerId ID of the user or community that owns the photo.
 * @property photoId Photo ID.
 * @property userId ID of the user to be tagged.
 * @property x Upper left-corner coordinate of the tagged area (as a percentage of the photo's width).
 * @property y Upper left-corner coordinate of the tagged area (as a percentage of the photo's height).
 * @property x2 Lower right-corner coordinate of the tagged area (as a percentage of the photo's width).
 * @property y2 Lower right-corner coordinate of the tagged area (as a percentage of the photo's height).
 */
class PhotosPutTagMethod(
    ownerId: Long? = null,
    photoId: Long,
    userId: Long,
    x: Double? = null,
    y: Double? = null,
    x2: Double? = null,
    y2: Double? = null
) : VkMethod<Long>(
    "photos.putTag",
    mutableMapOf(),
    successReference()
), UserMethod {

    var ownerId: Long? by props
    var photoId: Long by props
    var userId: Long by props
    var x: Double? by props
    var y: Double? by props
    var x2: Double? by props
    var y2: Double? by props

    init {
        this.ownerId = ownerId
        this.photoId = photoId
        this.userId = userId
        this.x = x
        this.y = y
        this.x2 = x2
        this.y2 = y2
    }
}
