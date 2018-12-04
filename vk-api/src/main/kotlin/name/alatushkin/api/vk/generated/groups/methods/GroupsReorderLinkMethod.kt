package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Allows to reorder links in the community.
 *
 *  [https://vk.com/dev/groups.reorderLink]
 *  @property [group_id] Community ID.
 *  @property [link_id] Link ID.
 *  @property [after] ID of the link after which to place the link with 'link_id'.
 */
class GroupsReorderLinkMethod() : VkMethod<Boolean>(
    "groups.reorderLink",
    HashMap()
) {

    var groupId: Long? by props
    var linkId: Long? by props
    var after: Long? by props

    constructor(
        groupId: Long? = null,
        linkId: Long? = null,
        after: Long? = null
    ) : this() {
        this.groupId = groupId
        this.linkId = linkId
        this.after = after
    }

    fun setGroupId(groupId: Long): GroupsReorderLinkMethod {
        this.groupId = groupId
        return this
    }

    fun setLinkId(linkId: Long): GroupsReorderLinkMethod {
        this.linkId = linkId
        return this
    }

    fun setAfter(after: Long): GroupsReorderLinkMethod {
        this.after = after
        return this
    }

    override val classRef = GroupsReorderLinkMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
