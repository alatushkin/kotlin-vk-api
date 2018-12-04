@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.groups.GroupXtrInvitedBy
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/groups.getInvites]
 *
 * Returns a list of invitations to join communities and events.
 *
 * @property offset Offset needed to return a specific subset of invitations.
 * @property count Number of invitations to return.
 */
class GroupsGetInvitesMethod(
        offset: Long? = null,
        count: Long? = null
) : VkMethod<VkList<GroupXtrInvitedBy>>(
    "groups.getInvites",
    mutableMapOf(),
    object : TypeReference<VkSuccess<VkList<GroupXtrInvitedBy>>>() {}
), UserMethod {

    var offset: Long? by props
    var count: Long? by props

    init {
        this.offset = offset
        this.count = count
    }

    fun setOffset(offset: Long): GroupsGetInvitesMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): GroupsGetInvitesMethod {
        this.count = count
        return this
    }
}
