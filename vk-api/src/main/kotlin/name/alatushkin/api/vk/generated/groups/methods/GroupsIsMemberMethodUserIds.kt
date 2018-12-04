@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserGroupServiceMethod

/**
 * [https://vk.com/dev/groups.isMember]
 *
 * Returns information specifying whether a user is a member of a community.
 *
 * @property groupId ID or screen name of the community.
 * @property userIds User IDs.
 */
class GroupsIsMemberMethodUserIds(
        groupId: String,
        userIds: Array<Long>? = null
) : VkMethod<Boolean>(
    "groups.isMember",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserGroupServiceMethod {

    var groupId: String by props
    var userIds: Array<Long>? by props

    init {
        this.groupId = groupId
        this.userIds = userIds
    }

    fun setGroupId(groupId: String): GroupsIsMemberMethodUserIds {
        this.groupId = groupId
        return this
    }

    fun setUserIds(userIds: Array<Long>): GroupsIsMemberMethodUserIds {
        this.userIds = userIds
        return this
    }
}
