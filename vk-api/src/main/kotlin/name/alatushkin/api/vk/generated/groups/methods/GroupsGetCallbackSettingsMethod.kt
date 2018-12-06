@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.groups.CallbackSettings
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserGroupMethod {

    var groupId: Long by props
    var serverId: Long? by props

    init {
        this.groupId = groupId
        this.serverId = serverId
    }
}
