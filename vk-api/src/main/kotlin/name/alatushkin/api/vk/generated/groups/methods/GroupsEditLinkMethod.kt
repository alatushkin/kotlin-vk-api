@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/groups.editLink]
 *
 * Allows to edit a link in the community.
 *
 * @property groupId Community ID.
 * @property linkId Link ID.
 * @property text New description text for the link.
 */
class GroupsEditLinkMethod(
        groupId: Long,
        linkId: Long,
        text: String? = null
) : VkMethod<Boolean>(
    "groups.editLink",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var groupId: Long by props
    var linkId: Long by props
    var text: String? by props

    init {
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
}
