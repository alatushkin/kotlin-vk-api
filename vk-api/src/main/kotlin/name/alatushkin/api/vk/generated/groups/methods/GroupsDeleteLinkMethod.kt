package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Allows to delete a link from the community.
 *
 *  [https://vk.com/dev/groups.deleteLink]
 *  @property [group_id] Community ID.
 *  @property [link_id] Link ID.
 */
class GroupsDeleteLinkMethod() : VkMethod<Boolean>(
    "groups.deleteLink",
    HashMap()
) {

    var groupId: Long? by props
    var linkId: Long? by props

    constructor(
        groupId: Long? = null,
        linkId: Long? = null
    ) : this() {
        this.groupId = groupId
        this.linkId = linkId
    }

    fun setGroupId(groupId: Long): GroupsDeleteLinkMethod {
        this.groupId = groupId
        return this
    }

    fun setLinkId(linkId: Long): GroupsDeleteLinkMethod {
        this.linkId = linkId
        return this
    }

    override val classRef = GroupsDeleteLinkMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
