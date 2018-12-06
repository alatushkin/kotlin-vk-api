@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.groups.LongPollSettings
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/groups.getLongPollSettings]
 *
 * Returns Long Poll notification settings
 *
 * @property groupId Community ID.
 */
class GroupsGetLongPollSettingsMethod(
    groupId: Long
) : VkMethod<LongPollSettings>(
    "groups.getLongPollSettings",
    mutableMapOf(),
    successReference()
), UserGroupMethod {

    var groupId: Long by props

    init {
        this.groupId = groupId
    }
}
