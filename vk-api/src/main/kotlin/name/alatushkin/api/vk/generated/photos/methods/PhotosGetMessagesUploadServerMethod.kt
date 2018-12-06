@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.photos.PhotoUpload
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserGroupMethod {

    var peerId: Long? by props

    init {
        this.peerId = peerId
    }
}
