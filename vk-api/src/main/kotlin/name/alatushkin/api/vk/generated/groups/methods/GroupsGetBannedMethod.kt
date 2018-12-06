@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.groups.OwnerXtrBanInfo
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/groups.getBanned]
 *
 * Returns a list of users on a community blacklist.
 *
 * @property groupId Community ID.
 * @property offset Offset needed to return a specific subset of users.
 * @property count Number of users to return.
 * @property fields 
 * @property userId 
 */
class GroupsGetBannedMethod(
    groupId: Long,
    offset: Long? = null,
    count: Long? = null,
    fields: Array<String>? = null,
    userId: Long? = null
) : VkMethod<VkList<OwnerXtrBanInfo>>(
    "groups.getBanned",
    mutableMapOf(),
    successReference()
), UserMethod {

    var groupId: Long by props
    var offset: Long? by props
    var count: Long? by props
    var fields: Array<String>? by props
    var userId: Long? by props

    init {
        this.groupId = groupId
        this.offset = offset
        this.count = count
        this.fields = fields
        this.userId = userId
    }
}
