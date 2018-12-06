@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.photos.PhotoFull
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/photos.getById]
 *
 * Returns information about photos by their IDs.
 *
 * @property photos IDs separated with a comma, that are IDs of users who posted photos and IDs of photos themselves with an underscore character between such IDs. To get information about a photo in the group album, you shall specify group ID instead of user ID. Example: "1_129207899,6492_135055734, , -20629724_271945303"
 * @property photoSizes '1' — to return photo sizes in a
 */
class PhotosGetByIdMethodExtended(
    photos: Array<String>,
    photoSizes: Boolean? = null
) : VkMethod<Array<PhotoFull>>(
    "photos.getById",
    mutableMapOf("extended" to "1"),
    successReference()
), UserServiceMethod {

    var photos: Array<String> by props
    var photoSizes: Boolean? by props

    init {
        this.photos = photos
        this.photoSizes = photoSizes
    }
}
