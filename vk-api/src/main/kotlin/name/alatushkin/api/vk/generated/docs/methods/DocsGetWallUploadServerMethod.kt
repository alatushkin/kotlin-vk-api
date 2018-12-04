package name.alatushkin.api.vk.generated.docs.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.common.UploadServer

/**
 *  Returns the server address for document upload onto a user's or community's wall.
 *
 *  [https://vk.com/dev/docs.getWallUploadServer]
 *  @property [group_id] Community ID (if the document will be uploaded to the community).
 */
class DocsGetWallUploadServerMethod() : VkMethod<UploadServer>(
    "docs.getWallUploadServer",
    HashMap()
) {

    var groupId: Long? by props

    constructor(
        groupId: Long? = null
    ) : this() {
        this.groupId = groupId
    }

    fun setGroupId(groupId: Long): DocsGetWallUploadServerMethod {
        this.groupId = groupId
        return this
    }

    override val classRef = DocsGetWallUploadServerMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<UploadServer>>() {}
    }
}
