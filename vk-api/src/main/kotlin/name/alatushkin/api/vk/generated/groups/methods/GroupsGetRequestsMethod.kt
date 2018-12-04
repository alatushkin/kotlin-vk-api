package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Returns a list of requests to the community.
 *
 *  [https://vk.com/dev/groups.getRequests]
 *  @property [group_id] Community ID.
 *  @property [offset] Offset needed to return a specific subset of results.
 *  @property [count] Number of results to return.
 */
class GroupsGetRequestsMethod() : VkMethod<VkList<Long>>(
    "groups.getRequests",
    mutableMapOf()
) {

    var groupId: Long? by props
    var offset: Long? by props
    var count: Long? by props

    constructor(
        groupId: Long? = null,
        offset: Long? = null,
        count: Long? = null
    ) : this() {
        this.groupId = groupId
        this.offset = offset
        this.count = count
    }

    fun setGroupId(groupId: Long): GroupsGetRequestsMethod {
        this.groupId = groupId
        return this
    }

    fun setOffset(offset: Long): GroupsGetRequestsMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): GroupsGetRequestsMethod {
        this.count = count
        return this
    }

    override val classRef = GroupsGetRequestsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<VkList<Long>>>() {}
    }
}
