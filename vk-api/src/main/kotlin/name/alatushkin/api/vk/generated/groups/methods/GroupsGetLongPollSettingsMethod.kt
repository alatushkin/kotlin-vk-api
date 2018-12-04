@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.groups.LongPollSettings
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
    object : TypeReference<VkSuccess<LongPollSettings>>() {}
), UserGroupMethod {

    var groupId: Long by props

    init {
        this.groupId = groupId
    }

    fun setGroupId(groupId: Long): GroupsGetLongPollSettingsMethod {
        this.groupId = groupId
        return this
    }
}
