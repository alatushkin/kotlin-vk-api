@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.groups.GroupSettings
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/groups.getSettings]
 *
 * Returns community settings.
 *
 * @property groupId Community ID.
 */
class GroupsGetSettingsMethod(
    groupId: Long
) : VkMethod<GroupSettings>(
    "groups.getSettings",
    mutableMapOf(),
    successReference()
), UserMethod {

    var groupId: Long by props

    init {
        this.groupId = groupId
    }
}
