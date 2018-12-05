@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.common.Image
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
    object : TypeReference<VkResponse<Array<Image>>>() {}
), UserMethod {

    var photo: String by props
    var hash: String by props

    init {
        this.photo = photo
        this.hash = hash
    }

    fun setPhoto(photo: String): PhotosSaveOwnerCoverPhotoMethod {
        this.photo = photo
        return this
    }

    fun setHash(hash: String): PhotosSaveOwnerCoverPhotoMethod {
        this.hash = hash
        return this
    }
}
