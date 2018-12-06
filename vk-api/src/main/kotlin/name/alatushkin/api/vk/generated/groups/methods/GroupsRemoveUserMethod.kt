@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/groups.removeUser]
 *
 * Removes a user from the community.
 *
 * @property groupId Community ID.
 * @property userId User ID.
 */
class GroupsRemoveUserMethod(
    groupId: Long,
    userId: Long
) : VkMethod<Boolean>(
    "groups.removeUser",
    mutableMapOf(),
    successReference()
), UserMethod {

    var groupId: Long by props
    var userId: Long by props

    init {
        this.groupId = groupId
        this.userId = userId
    }
}
