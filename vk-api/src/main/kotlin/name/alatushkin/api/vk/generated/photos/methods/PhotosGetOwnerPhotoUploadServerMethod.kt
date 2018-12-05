@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.common.UploadServer
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.getOwnerPhotoUploadServer]
 *
 * Returns an upload server address for a profile or community photo.
 *
 * @property ownerId identifier of a community or current user. "Note that community id must be negative. 'owner_id=1' – user, 'owner_id=-1' – community, "
 */
class PhotosGetOwnerPhotoUploadServerMethod(
        ownerId: Long? = null
) : VkMethod<UploadServer>(
    "photos.getOwnerPhotoUploadServer",
    mutableMapOf(),
    object : TypeReference<VkResponse<UploadServer>>() {}
), UserMethod {

    var ownerId: Long? by props

    init {
        this.ownerId = ownerId
    }

    fun setOwnerId(ownerId: Long): PhotosGetOwnerPhotoUploadServerMethod {
        this.ownerId = ownerId
        return this
    }
}
