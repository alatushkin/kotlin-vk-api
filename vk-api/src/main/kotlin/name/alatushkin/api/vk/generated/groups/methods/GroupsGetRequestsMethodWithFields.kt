package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.users.UserFull

/**
 *  Returns a list of requests to the community.
 *
 *  [https://vk.com/dev/groups.getRequests]
 *  @property [group_id] Community ID.
 *  @property [offset] Offset needed to return a specific subset of results.
 *  @property [count] Number of results to return.
 *  @property [fields] Profile fields to return.
 */
class GroupsGetRequestsMethodWithFields() : VkMethod<VkList<UserFull>>(
    "groups.getRequests",
    HashMap()
) {

    var groupId: Long? by props
    var offset: Long? by props
    var count: Long? by props
    var fields: Array<String>? by props

    constructor(
        groupId: Long? = null,
        offset: Long? = null,
        count: Long? = null,
        fields: Array<String>? = null
    ) : this() {
        this.groupId = groupId
        this.offset = offset
        this.count = count
        this.fields = fields
    }

    fun setGroupId(groupId: Long): GroupsGetRequestsMethodWithFields {
        this.groupId = groupId
        return this
    }

    fun setOffset(offset: Long): GroupsGetRequestsMethodWithFields {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): GroupsGetRequestsMethodWithFields {
        this.count = count
        return this
    }

    fun setFields(fields: Array<String>): GroupsGetRequestsMethodWithFields {
        this.fields = fields
        return this
    }

    override val classRef = GroupsGetRequestsMethodWithFields.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<VkList<UserFull>>>() {}
    }
}
