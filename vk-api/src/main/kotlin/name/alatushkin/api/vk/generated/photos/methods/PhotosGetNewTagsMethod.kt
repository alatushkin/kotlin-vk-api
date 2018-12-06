@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.photos.PhotoXtrTagInfo
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.getNewTags]
 *
 * Returns a list of photos with tags that have not been viewed.
 *
 * @property offset Offset needed to return a specific subset of photos.
 * @property count Number of photos to return.
 */
class PhotosGetNewTagsMethod(
    offset: Long? = null,
    count: Long? = null
) : VkMethod<VkList<PhotoXtrTagInfo>>(
    "photos.getNewTags",
    mutableMapOf(),
    successReference()
), UserMethod {

    var offset: Long? by props
    var count: Long? by props

    init {
        this.offset = offset
        this.count = count
    }
}
