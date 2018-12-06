@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.getAlbumsCount]
 *
 * Returns the number of photo albums belonging to a user or community.
 *
 * @property userId User ID.
 * @property groupId Community ID.
 */
class PhotosGetAlbumsCountMethod(
    userId: Long? = null,
    groupId: Long? = null
) : VkMethod<Long>(
    "photos.getAlbumsCount",
    mutableMapOf(),
    successReference()
), UserMethod {

    var userId: Long? by props
    var groupId: Long? by props

    init {
        this.userId = userId
        this.groupId = groupId
    }
}
