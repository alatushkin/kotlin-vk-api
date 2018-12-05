@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.groups.GroupFull
import name.alatushkin.api.vk.tokens.UserGroupServiceMethod

/**
 * [https://vk.com/dev/groups.getById]
 *
 * Returns information about communities by their IDs.
 *
 * @property groupIds IDs or screen names of communities.
 * @property groupId ID or screen name of the community.
 * @property fields Group fields to return.
 */
class GroupsGetByIdMethod(
        groupIds: Array<String>? = null,
        groupId: String? = null,
        fields: Array<String>? = null
) : VkMethod<Array<GroupFull>>(
    "groups.getById",
    mutableMapOf(),
    object : TypeReference<VkResponse<Array<GroupFull>>>() {}
), UserGroupServiceMethod {

    var groupIds: Array<String>? by props
    var groupId: String? by props
    var fields: Array<String>? by props

    init {
        this.groupIds = groupIds
        this.groupId = groupId
        this.fields = fields
    }

    fun setGroupIds(groupIds: Array<String>): GroupsGetByIdMethod {
        this.groupIds = groupIds
        return this
    }

    fun setGroupId(groupId: String): GroupsGetByIdMethod {
        this.groupId = groupId
        return this
    }

    fun setFields(fields: Array<String>): GroupsGetByIdMethod {
        this.fields = fields
        return this
    }
}
