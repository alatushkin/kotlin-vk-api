@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.callback.ServerInfo

/**
 * [https://vk.com/dev/groups.getCallbackServers]
 *
 * null
 *
 * @property groupId Community ID.
 */
class GroupsGetCallbackServersMethod(
        groupId: Long
) : VkMethod<VkList<ServerInfo>>(
    "groups.getCallbackServers",
    mutableMapOf(),
    object : TypeReference<VkSuccess<VkList<ServerInfo>>>() {}
) {

    var groupId: Long by props

    init {
        this.groupId = groupId
    }

    fun setGroupId(groupId: Long): GroupsGetCallbackServersMethod {
        this.groupId = groupId
        return this
    }
}
