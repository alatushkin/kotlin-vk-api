package name.alatushkin.api.vk.generated.docs.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.common.UploadServer
import name.alatushkin.api.vk.generated.docs.GetMessagesUploadServerType

/**
 *  Returns the server address for document upload.
 *
 *  [https://vk.com/dev/docs.getMessagesUploadServer]
 *  @property [type] Document type.
 *  @property [peer_id] Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'Chat ID', e.g. '2000000001'. For community: '- Community ID', e.g. '-12345'. "
 */
class DocsGetMessagesUploadServerMethod() : VkMethod<UploadServer>(
    "docs.getMessagesUploadServer",
    HashMap()
) {

    var type: GetMessagesUploadServerType? by props
    var peerId: Long? by props

    constructor(
        type: GetMessagesUploadServerType? = null,
        peerId: Long? = null
    ) : this() {
        this.type = type
        this.peerId = peerId
    }

    fun setType(type: GetMessagesUploadServerType): DocsGetMessagesUploadServerMethod {
        this.type = type
        return this
    }

    fun setPeerId(peerId: Long): DocsGetMessagesUploadServerMethod {
        this.peerId = peerId
        return this
    }

    override val classRef = DocsGetMessagesUploadServerMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<UploadServer>>() {}
    }
}
