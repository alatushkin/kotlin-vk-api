@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.groups.OwnerXtrBanInfo
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
    object : TypeReference<VkResponse<VkList<OwnerXtrBanInfo>>>() {}
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

    fun setGroupId(groupId: Long): GroupsGetBannedMethod {
        this.groupId = groupId
        return this
    }

    fun setOffset(offset: Long): GroupsGetBannedMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): GroupsGetBannedMethod {
        this.count = count
        return this
    }

    fun setFields(fields: Array<String>): GroupsGetBannedMethod {
        this.fields = fields
        return this
    }

    fun setUserId(userId: Long): GroupsGetBannedMethod {
        this.userId = userId
        return this
    }
}
