@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserGroupServiceMethod

/**
 * [https://vk.com/dev/groups.isMember]
 *
 * Returns information specifying whether a user is a member of a community.
 *
 * @property groupId ID or screen name of the community.
 * @property userId User ID.
 */
class GroupsIsMemberMethod(
        groupId: String,
        userId: Long? = null
) : VkMethod<Boolean>(
    "groups.isMember",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserGroupServiceMethod {

    var groupId: String by props
    var userId: Long? by props

    init {
        this.groupId = groupId
        this.userId = userId
    }

    fun setGroupId(groupId: String): GroupsIsMemberMethod {
        this.groupId = groupId
        return this
    }

    fun setUserId(userId: Long): GroupsIsMemberMethod {
        this.userId = userId
        return this
    }
}
