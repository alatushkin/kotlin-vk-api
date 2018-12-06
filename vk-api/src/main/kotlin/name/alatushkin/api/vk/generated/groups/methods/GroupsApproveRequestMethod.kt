@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/groups.approveRequest]
 *
 * Allows to approve join request to the community.
 *
 * @property groupId Community ID.
 * @property userId User ID.
 */
class GroupsApproveRequestMethod(
    groupId: Long,
    userId: Long
) : VkMethod<Boolean>(
    "groups.approveRequest",
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
