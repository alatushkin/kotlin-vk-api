package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Allows to add a link to the community.
 *
 *  [https://vk.com/dev/groups.addLink]
 *  @property [group_id] Community ID.
 *  @property [link] Link URL.
 *  @property [text] Description text for the link.
 */
class GroupsAddLinkMethod() : VkMethod<Boolean>(
    "groups.addLink",
    HashMap()
) {

    var groupId: Long? by props
    var link: String? by props
    var text: String? by props

    constructor(
        groupId: Long? = null,
        link: String? = null,
        text: String? = null
    ) : this() {
        this.groupId = groupId
        this.link = link
        this.text = text
    }

    fun setGroupId(groupId: Long): GroupsAddLinkMethod {
        this.groupId = groupId
        return this
    }

    fun setLink(link: String): GroupsAddLinkMethod {
        this.link = link
        return this
    }

    fun setText(text: String): GroupsAddLinkMethod {
        this.text = text
        return this
    }

    override val classRef = GroupsAddLinkMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
