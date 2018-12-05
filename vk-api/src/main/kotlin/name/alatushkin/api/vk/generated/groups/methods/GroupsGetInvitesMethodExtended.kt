@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.groups.GetInvitesExtendedResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/groups.getInvites]
 *
 * Returns a list of invitations to join communities and events.
 *
 * @property offset Offset needed to return a specific subset of invitations.
 * @property count Number of invitations to return.
 */
class GroupsGetInvitesMethodExtended(
        offset: Long? = null,
        count: Long? = null
) : VkMethod<GetInvitesExtendedResponse>(
    "groups.getInvites",
    mutableMapOf("extended" to "1"),
    object : TypeReference<VkResponse<GetInvitesExtendedResponse>>() {}
), UserMethod {

    var offset: Long? by props
    var count: Long? by props

    init {
        this.offset = offset
        this.count = count
    }

    fun setOffset(offset: Long): GroupsGetInvitesMethodExtended {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): GroupsGetInvitesMethodExtended {
        this.count = count
        return this
    }
}
