package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.groups.CallbackSettings

/**
 *  Returns [vk.com/dev/callback_api|Callback API] notifications settings.
 *
 *  [https://vk.com/dev/groups.getCallbackSettings]
 *  @property [group_id] Community ID.
 *  @property [server_id] Server ID.
 */
class GroupsGetCallbackSettingsMethod() : VkMethod<CallbackSettings>(
    "groups.getCallbackSettings",
    HashMap()
) {

    var groupId: Long? by props
    var serverId: Long? by props

    constructor(
        groupId: Long? = null,
        serverId: Long? = null
    ) : this() {
        this.groupId = groupId
        this.serverId = serverId
    }

    fun setGroupId(groupId: Long): GroupsGetCallbackSettingsMethod {
        this.groupId = groupId
        return this
    }

    fun setServerId(serverId: Long): GroupsGetCallbackSettingsMethod {
        this.serverId = serverId
        return this
    }

    override val classRef = GroupsGetCallbackSettingsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<CallbackSettings>>() {}
    }
}
