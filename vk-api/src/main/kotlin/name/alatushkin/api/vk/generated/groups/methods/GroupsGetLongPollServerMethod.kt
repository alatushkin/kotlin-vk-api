@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.groups.LongPollServer
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/groups.getLongPollServer]
 *
 * Returns the data needed to query a Long Poll server for events
 *
 * @property groupId Community ID
 */
class GroupsGetLongPollServerMethod(
        groupId: Long
) : VkMethod<LongPollServer>(
    "groups.getLongPollServer",
    mutableMapOf(),
    object : TypeReference<VkSuccess<LongPollServer>>() {}
), UserGroupMethod {

    var groupId: Long by props

    init {
        this.groupId = groupId
    }

    fun setGroupId(groupId: Long): GroupsGetLongPollServerMethod {
        this.groupId = groupId
        return this
    }
}
