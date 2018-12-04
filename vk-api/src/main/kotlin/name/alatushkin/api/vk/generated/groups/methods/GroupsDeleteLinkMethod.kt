@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/groups.deleteLink]
 *
 * Allows to delete a link from the community.
 *
 * @property groupId Community ID.
 * @property linkId Link ID.
 */
class GroupsDeleteLinkMethod(
        groupId: Long,
        linkId: Long
) : VkMethod<Boolean>(
    "groups.deleteLink",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserMethod {

    var groupId: Long by props
    var linkId: Long by props

    init {
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
}
