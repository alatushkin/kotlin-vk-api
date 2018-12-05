@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.photos.SaveOwnerPhotoResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.saveOwnerPhoto]
 *
 * Saves a profile or community photo. Upload URL can be got with the [vk.com/dev/photos.getOwnerPhotoUploadServer|photos.getOwnerPhotoUploadServer] method.
 *
 * @property server parameter returned after [vk.com/dev/upload_files|photo upload].
 * @property hash parameter returned after [vk.com/dev/upload_files|photo upload].
 * @property photo parameter returned after [vk.com/dev/upload_files|photo upload].
 */
class PhotosSaveOwnerPhotoMethod(
        server: String? = null,
        hash: String? = null,
        photo: String? = null
) : VkMethod<SaveOwnerPhotoResponse>(
    "photos.saveOwnerPhoto",
    mutableMapOf(),
    object : TypeReference<VkResponse<SaveOwnerPhotoResponse>>() {}
), UserMethod {

    var server: String? by props
    var hash: String? by props
    var photo: String? by props

    init {
        this.server = server
        this.hash = hash
        this.photo = photo
    }

    fun setServer(server: String): PhotosSaveOwnerPhotoMethod {
        this.server = server
        return this
    }

    fun setHash(hash: String): PhotosSaveOwnerPhotoMethod {
        this.hash = hash
        return this
    }

    fun setPhoto(photo: String): PhotosSaveOwnerPhotoMethod {
        this.photo = photo
        return this
    }
}
