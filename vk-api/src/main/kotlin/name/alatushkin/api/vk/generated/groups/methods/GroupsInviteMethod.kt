@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/groups.invite]
 *
 * Allows to invite friends to the community.
 *
 * @property groupId Community ID.
 * @property userId User ID.
 */
class GroupsInviteMethod(
    groupId: Long,
    userId: Long
) : VkMethod<Boolean>(
    "groups.invite",
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
