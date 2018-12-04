@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.groups.MemberRole
import name.alatushkin.api.vk.generated.groups.Sort
import name.alatushkin.api.vk.tokens.UserGroupServiceMethod

/**
 * [https://vk.com/dev/groups.getMembers]
 *
 * Returns a list of community members.
 *
 * @property groupId ID or screen name of the community.
 * @property sort Sort order. Available values: 'id_asc', 'id_desc', 'time_asc', 'time_desc'. 'time_asc' and 'time_desc' are availavle only if the method is called by the group's 'moderator'.
 * @property offset Offset needed to return a specific subset of community members.
 * @property count Number of community members to return.
 */
class GroupsGetMembersMethodManagers(
        groupId: String? = null,
        sort: Sort? = null,
        offset: Long? = null,
        count: Long? = null
) : VkMethod<VkList<MemberRole>>(
    "groups.getMembers",
    mutableMapOf("filter" to "managers"),
    object : TypeReference<VkSuccess<VkList<MemberRole>>>() {}
), UserGroupServiceMethod {

    var groupId: String? by props
    var sort: Sort? by props
    var offset: Long? by props
    var count: Long? by props

    init {
        this.groupId = groupId
        this.sort = sort
        this.offset = offset
        this.count = count
    }

    fun setGroupId(groupId: String): GroupsGetMembersMethodManagers {
        this.groupId = groupId
        return this
    }

    fun setSort(sort: Sort): GroupsGetMembersMethodManagers {
        this.sort = sort
        return this
    }

    fun setOffset(offset: Long): GroupsGetMembersMethodManagers {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): GroupsGetMembersMethodManagers {
        this.count = count
        return this
    }
}
