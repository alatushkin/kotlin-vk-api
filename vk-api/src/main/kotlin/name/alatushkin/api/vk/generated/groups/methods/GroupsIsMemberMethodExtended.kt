@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.groups.IsMemberExtendedResponse
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserGroupServiceMethod

/**
 * [https://vk.com/dev/groups.isMember]
 *
 * Returns information specifying whether a user is a member of a community.
 *
 * @property groupId ID or screen name of the community.
 * @property userId User ID.
 */
class GroupsIsMemberMethodExtended(
    groupId: String,
    userId: Long? = null
) : VkMethod<IsMemberExtendedResponse>(
    "groups.isMember",
    mutableMapOf("extended" to "1"),
    successReference()
), UserGroupServiceMethod {

    var groupId: String by props
    var userId: Long? by props

    init {
        this.groupId = groupId
        this.userId = userId
    }
}
