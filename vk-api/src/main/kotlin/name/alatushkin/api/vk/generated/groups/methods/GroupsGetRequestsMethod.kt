@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/groups.getRequests]
 *
 * Returns a list of requests to the community.
 *
 * @property groupId Community ID.
 * @property offset Offset needed to return a specific subset of results.
 * @property count Number of results to return.
 */
class GroupsGetRequestsMethod(
    groupId: Long,
    offset: Long? = null,
    count: Long? = null
) : VkMethod<VkList<Long>>(
    "groups.getRequests",
    mutableMapOf(),
    successReference()
), UserMethod {

    var groupId: Long by props
    var offset: Long? by props
    var count: Long? by props

    init {
        this.groupId = groupId
        this.offset = offset
        this.count = count
    }
}
