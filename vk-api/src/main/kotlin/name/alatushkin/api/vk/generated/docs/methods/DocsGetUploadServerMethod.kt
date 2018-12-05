@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.docs.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.common.UploadServer
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/docs.getUploadServer]
 *
 * Returns the server address for document upload.
 *
 * @property groupId Community ID (if the document will be uploaded to the community).
 */
class DocsGetUploadServerMethod(
        groupId: Long? = null
) : VkMethod<UploadServer>(
    "docs.getUploadServer",
    mutableMapOf(),
    object : TypeReference<VkResponse<UploadServer>>() {}
), UserMethod {

    var groupId: Long? by props

    init {
        this.groupId = groupId
    }

    fun setGroupId(groupId: Long): DocsGetUploadServerMethod {
        this.groupId = groupId
        return this
    }
}
