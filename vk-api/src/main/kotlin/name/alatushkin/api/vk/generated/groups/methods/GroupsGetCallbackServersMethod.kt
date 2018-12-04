package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.callback.ServerInfo

/**
 *  null
 *
 *  [https://vk.com/dev/groups.getCallbackServers]
 *  @property [group_id] Community ID.
 */
class GroupsGetCallbackServersMethod() : VkMethod<VkList<ServerInfo>>(
    "groups.getCallbackServers",
    HashMap()
) {

    var groupId: Long? by props

    constructor(
        groupId: Long? = null
    ) : this() {
        this.groupId = groupId
    }

    fun setGroupId(groupId: Long): GroupsGetCallbackServersMethod {
        this.groupId = groupId
        return this
    }

    override val classRef = GroupsGetCallbackServersMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<VkList<ServerInfo>>>() {}
    }
}
