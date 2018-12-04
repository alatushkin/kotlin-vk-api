@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
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
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserMethod {

    var groupId: Long by props
    var userId: Long by props

    init {
        this.groupId = groupId
        this.userId = userId
    }

    fun setGroupId(groupId: Long): GroupsRemoveUserMethod {
        this.groupId = groupId
        return this
    }

    fun setUserId(userId: Long): GroupsRemoveUserMethod {
        this.userId = userId
        return this
    }
}
