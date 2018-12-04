@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.groups.CallbackSettings
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/groups.getCallbackSettings]
 *
 * Returns [vk.com/dev/callback_api|Callback API] notifications settings.
 *
 * @property groupId Community ID.
 * @property serverId Server ID.
 */
class GroupsGetCallbackSettingsMethod(
        groupId: Long,
        serverId: Long? = null
) : VkMethod<CallbackSettings>(
    "groups.getCallbackSettings",
    mutableMapOf(),
    object : TypeReference<VkSuccess<CallbackSettings>>() {}
), UserGroupMethod {

    var groupId: Long by props
    var serverId: Long? by props

    init {
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
}
