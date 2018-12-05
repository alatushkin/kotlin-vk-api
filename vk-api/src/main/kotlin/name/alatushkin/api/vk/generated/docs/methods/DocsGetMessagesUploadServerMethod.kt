@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.docs.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.common.UploadServer
import name.alatushkin.api.vk.generated.docs.GetMessagesUploadServerType
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/docs.getMessagesUploadServer]
 *
 * Returns the server address for document upload.
 *
 * @property type Document type.
 * @property peerId Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'Chat ID', e.g. '2000000001'. For community: '- Community ID', e.g. '-12345'. "
 */
class DocsGetMessagesUploadServerMethod(
        type: GetMessagesUploadServerType? = null,
        peerId: Long? = null
) : VkMethod<UploadServer>(
    "docs.getMessagesUploadServer",
    mutableMapOf(),
    object : TypeReference<VkResponse<UploadServer>>() {}
), UserGroupMethod {

    var type: GetMessagesUploadServerType? by props
    var peerId: Long? by props

    init {
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
}
