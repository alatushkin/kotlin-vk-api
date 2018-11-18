package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.groups.GroupXtrInvitedBy

/**
 *  Returns a list of invitations to join communities and events.
 *
 *  [https://vk.com/dev/groups.getInvites]
 *  @property [offset] Offset needed to return a specific subset of invitations.
 *  @property [count] Number of invitations to return.
 */
class GroupsGetInvitesMethod() : VkMethod<VkList<GroupXtrInvitedBy>>(
    "groups.getInvites",
    mutableMapOf()
) {

    var offset: Long? by props
    var count: Long? by props

    constructor(
        offset: Long? = null,
        count: Long? = null
    ) : this() {
        this.offset = offset
        this.count = count
    }

    fun setOffset(offset: Long): GroupsGetInvitesMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): GroupsGetInvitesMethod {
        this.count = count
        return this
    }

    override val classRef = GroupsGetInvitesMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<GroupXtrInvitedBy>>>() {}
    }
}
