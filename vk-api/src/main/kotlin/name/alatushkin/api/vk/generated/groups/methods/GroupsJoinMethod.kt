@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/groups.join]
 *
 * With this method you can join the group or public page, and also confirm your participation in an event.
 *
 * @property groupId ID or screen name of the community.
 * @property notSure Optional parameter which is taken into account when 'gid' belongs to the event: '1' — Perhaps I will attend, '0' — I will be there for sure (default), ,
 */
class GroupsJoinMethod(
        groupId: Long? = null,
        notSure: String? = null
) : VkMethod<Boolean>(
    "groups.join",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserMethod {

    var groupId: Long? by props
    var notSure: String? by props

    init {
        this.groupId = groupId
        this.notSure = notSure
    }

    fun setGroupId(groupId: Long): GroupsJoinMethod {
        this.groupId = groupId
        return this
    }

    fun setNotSure(notSure: String): GroupsJoinMethod {
        this.notSure = notSure
        return this
    }
}
