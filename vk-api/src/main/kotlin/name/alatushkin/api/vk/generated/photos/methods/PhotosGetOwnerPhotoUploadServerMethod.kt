@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.common.UploadServer
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var ownerId: Long? by props

    init {
        this.ownerId = ownerId
    }
}
