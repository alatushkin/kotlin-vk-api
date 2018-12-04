package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.groups.GroupFull

/**
 *  Returns information about communities by their IDs.
 *
 *  [https://vk.com/dev/groups.getById]
 *  @property [group_ids] IDs or screen names of communities.
 *  @property [group_id] ID or screen name of the community.
 *  @property [fields] Group fields to return.
 */
class GroupsGetByIdMethod() : VkMethod<Array<GroupFull>>(
    "groups.getById",
    HashMap()
) {

    var groupIds: Array<String>? by props
    var groupId: String? by props
    var fields: Array<String>? by props

    constructor(
        groupIds: Array<String>? = null,
        groupId: String? = null,
        fields: Array<String>? = null
    ) : this() {
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

    override val classRef = GroupsGetByIdMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Array<GroupFull>>>() {}
    }
}
