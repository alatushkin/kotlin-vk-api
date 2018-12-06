@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.groups.LongPollServer
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserGroupMethod {

    var groupId: Long by props

    init {
        this.groupId = groupId
    }
}
