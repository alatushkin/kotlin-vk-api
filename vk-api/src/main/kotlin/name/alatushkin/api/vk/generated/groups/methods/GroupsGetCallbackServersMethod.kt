@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.callback.ServerInfo
import name.alatushkin.api.vk.successReference

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
    successReference()
) {

    var groupId: Long by props

    init {
        this.groupId = groupId
    }
}
