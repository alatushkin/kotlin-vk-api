@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.groups.GetCallbackConfirmationCodeResponse
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/groups.getCallbackConfirmationCode]
 *
 * Returns Callback API confirmation code for the community.
 *
 * @property groupId Community ID.
 */
class GroupsGetCallbackConfirmationCodeMethod(
        groupId: Long
) : VkMethod<GetCallbackConfirmationCodeResponse>(
    "groups.getCallbackConfirmationCode",
    mutableMapOf(),
    object : TypeReference<VkSuccess<GetCallbackConfirmationCodeResponse>>() {}
), UserGroupMethod {

    var groupId: Long by props

    init {
        this.groupId = groupId
    }

    fun setGroupId(groupId: Long): GroupsGetCallbackConfirmationCodeMethod {
        this.groupId = groupId
        return this
    }
}
