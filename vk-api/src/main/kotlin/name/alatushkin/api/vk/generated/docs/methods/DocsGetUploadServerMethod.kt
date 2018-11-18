package name.alatushkin.api.vk.generated.docs.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.common.UploadServer

/**
 *  Returns the server address for document upload.
 *
 *  [https://vk.com/dev/docs.getUploadServer]
 *  @property [group_id] Community ID (if the document will be uploaded to the community).
 */
class DocsGetUploadServerMethod() : VkMethod<UploadServer>(
    "docs.getUploadServer",
    HashMap()
) {

    var groupId: Long? by props

    constructor(
        groupId: Long? = null
    ) : this() {
        this.groupId = groupId
    }

    fun setGroupId(groupId: Long): DocsGetUploadServerMethod {
        this.groupId = groupId
        return this
    }

    override val classRef = DocsGetUploadServerMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<UploadServer>>() {}
    }
}
