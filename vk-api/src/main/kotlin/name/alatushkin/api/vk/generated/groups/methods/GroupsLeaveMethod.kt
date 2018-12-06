@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/groups.leave]
 *
 * With this method you can leave a group, public page, or event.
 *
 * @property groupId ID or screen name of the community.
 */
class GroupsLeaveMethod(
    groupId: Long
) : VkMethod<Boolean>(
    "groups.leave",
    mutableMapOf(),
    successReference()
), UserMethod {

    var groupId: Long by props

    init {
        this.groupId = groupId
    }
}
