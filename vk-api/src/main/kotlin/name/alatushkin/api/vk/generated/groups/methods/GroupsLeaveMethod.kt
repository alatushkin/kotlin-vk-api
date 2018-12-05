@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
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
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var groupId: Long by props

    init {
        this.groupId = groupId
    }

    fun setGroupId(groupId: Long): GroupsLeaveMethod {
        this.groupId = groupId
        return this
    }
}
