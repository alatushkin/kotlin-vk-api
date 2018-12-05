@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.docs.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.common.UploadServer
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/docs.getWallUploadServer]
 *
 * Returns the server address for document upload onto a user's or community's wall.
 *
 * @property groupId Community ID (if the document will be uploaded to the community).
 */
class DocsGetWallUploadServerMethod(
        groupId: Long? = null
) : VkMethod<UploadServer>(
    "docs.getWallUploadServer",
    mutableMapOf(),
    object : TypeReference<VkResponse<UploadServer>>() {}
), UserGroupMethod {

    var groupId: Long? by props

    init {
        this.groupId = groupId
    }

    fun setGroupId(groupId: Long): DocsGetWallUploadServerMethod {
        this.groupId = groupId
        return this
    }
}
