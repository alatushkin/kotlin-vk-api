@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.groups.Filter
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
 * @property filter *'friends' – only friends in this community will be returned,, *'unsure' – only those who pressed 'I may attend' will be returned (if it's an event).
 */
class GroupsGetMembersMethod(
        groupId: String? = null,
        sort: Sort? = null,
        offset: Long? = null,
        count: Long? = null,
        filter: Filter? = null
) : VkMethod<VkList<Long>>(
    "groups.getMembers",
    mutableMapOf(),
    object : TypeReference<VkResponse<VkList<Long>>>() {}
), UserGroupServiceMethod {

    var groupId: String? by props
    var sort: Sort? by props
    var offset: Long? by props
    var count: Long? by props
    var filter: Filter? by props

    init {
        this.groupId = groupId
        this.sort = sort
        this.offset = offset
        this.count = count
        this.filter = filter
    }

    fun setGroupId(groupId: String): GroupsGetMembersMethod {
        this.groupId = groupId
        return this
    }

    fun setSort(sort: Sort): GroupsGetMembersMethod {
        this.sort = sort
        return this
    }

    fun setOffset(offset: Long): GroupsGetMembersMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): GroupsGetMembersMethod {
        this.count = count
        return this
    }

    fun setFilter(filter: Filter): GroupsGetMembersMethod {
        this.filter = filter
        return this
    }
}
