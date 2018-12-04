package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Allows to edit a link in the community.
 *
 *  [https://vk.com/dev/groups.editLink]
 *  @property [group_id] Community ID.
 *  @property [link_id] Link ID.
 *  @property [text] New description text for the link.
 */
class GroupsEditLinkMethod() : VkMethod<Boolean>(
    "groups.editLink",
    HashMap()
) {

    var groupId: Long? by props
    var linkId: Long? by props
    var text: String? by props

    constructor(
        groupId: Long? = null,
        linkId: Long? = null,
        text: String? = null
    ) : this() {
        this.groupId = groupId
        this.linkId = linkId
        this.text = text
    }

    fun setGroupId(groupId: Long): GroupsEditLinkMethod {
        this.groupId = groupId
        return this
    }

    fun setLinkId(linkId: Long): GroupsEditLinkMethod {
        this.linkId = linkId
        return this
    }

    fun setText(text: String): GroupsEditLinkMethod {
        this.text = text
        return this
    }

    override val classRef = GroupsEditLinkMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
