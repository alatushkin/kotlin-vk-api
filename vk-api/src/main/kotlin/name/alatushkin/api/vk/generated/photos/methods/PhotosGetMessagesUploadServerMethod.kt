package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.photos.PhotoUpload

/**
 *  Returns the server address for photo upload in a private message for a user.
 *
 *  [https://vk.com/dev/photos.getMessagesUploadServer]
 *  @property [peer_id] Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'Chat ID', e.g. '2000000001'. For community: '- Community ID', e.g. '-12345'. "
 */
class PhotosGetMessagesUploadServerMethod() : VkMethod<PhotoUpload>(
    "photos.getMessagesUploadServer",
    HashMap()
) {

    var peerId: Long? by props

    constructor(
        peerId: Long? = null
    ) : this() {
        this.peerId = peerId
    }

    fun setPeerId(peerId: Long): PhotosGetMessagesUploadServerMethod {
        this.peerId = peerId
        return this
    }

    override val classRef = PhotosGetMessagesUploadServerMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<PhotoUpload>>() {}
    }
}
