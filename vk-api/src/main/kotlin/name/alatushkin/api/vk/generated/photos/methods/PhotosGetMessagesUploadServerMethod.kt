@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.photos.PhotoUpload
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/photos.getMessagesUploadServer]
 *
 * Returns the server address for photo upload in a private message for a user.
 *
 * @property peerId Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'Chat ID', e.g. '2000000001'. For community: '- Community ID', e.g. '-12345'. "
 */
class PhotosGetMessagesUploadServerMethod(
        peerId: Long? = null
) : VkMethod<PhotoUpload>(
    "photos.getMessagesUploadServer",
    mutableMapOf(),
    object : TypeReference<VkResponse<PhotoUpload>>() {}
), UserGroupMethod {

    var peerId: Long? by props

    init {
        this.peerId = peerId
    }

    fun setPeerId(peerId: Long): PhotosGetMessagesUploadServerMethod {
        this.peerId = peerId
        return this
    }
}
