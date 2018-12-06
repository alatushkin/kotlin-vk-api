@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.common.Image
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.saveOwnerCoverPhoto]
 *
 * Saves cover photo after successful uploading.
 *
 * @property photo Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 * @property hash Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 */
class PhotosSaveOwnerCoverPhotoMethod(
    photo: String,
    hash: String
) : VkMethod<Array<Image>>(
    "photos.saveOwnerCoverPhoto",
    mutableMapOf(),
    successReference()
), UserMethod {

    var photo: String by props
    var hash: String by props

    init {
        this.photo = photo
        this.hash = hash
    }
}
