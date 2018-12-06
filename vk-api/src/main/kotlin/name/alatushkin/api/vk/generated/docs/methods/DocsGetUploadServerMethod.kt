@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.docs.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.common.UploadServer
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var groupId: Long? by props

    init {
        this.groupId = groupId
    }
}
