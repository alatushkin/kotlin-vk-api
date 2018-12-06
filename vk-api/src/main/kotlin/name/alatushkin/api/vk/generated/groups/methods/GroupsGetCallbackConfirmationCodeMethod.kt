@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.groups.GetCallbackConfirmationCodeResponse
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserGroupMethod {

    var groupId: Long by props

    init {
        this.groupId = groupId
    }
}
