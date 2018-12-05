@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
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
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var groupId: Long by props
    var userId: Long by props

    init {
        this.groupId = groupId
        this.userId = userId
    }

    fun setGroupId(groupId: Long): GroupsApproveRequestMethod {
        this.groupId = groupId
        return this
    }

    fun setUserId(userId: Long): GroupsApproveRequestMethod {
        this.userId = userId
        return this
    }
}
