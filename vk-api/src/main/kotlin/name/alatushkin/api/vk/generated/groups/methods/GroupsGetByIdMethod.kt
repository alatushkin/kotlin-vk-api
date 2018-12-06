@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.groups.GroupFull
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserGroupServiceMethod

/**
 * [https://vk.com/dev/groups.getById]
 *
 * Returns information about communities by their IDs.
 *
 * @property groupIds IDs or screen names of communities.
 * @property groupId ID or screen name of the community.
 * @property fields Group fields to return.
 */
class GroupsGetByIdMethod(
    groupIds: Array<String>? = null,
    groupId: String? = null,
    fields: Array<String>? = null
) : VkMethod<Array<GroupFull>>(
    "groups.getById",
    mutableMapOf(),
    successReference()
), UserGroupServiceMethod {

    var groupIds: Array<String>? by props
    var groupId: String? by props
    var fields: Array<String>? by props

    init {
        this.groupIds = groupIds
        this.groupId = groupId
        this.fields = fields
    }
}
