package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.groups.OwnerXtrBanInfo

/**
 *  Returns a list of users on a community blacklist.
 *
 *  [https://vk.com/dev/groups.getBanned]
 *  @property [group_id] Community ID.
 *  @property [offset] Offset needed to return a specific subset of users.
 *  @property [count] Number of users to return.
 *  @property [fields]
 *  @property [user_id]
 */
class GroupsGetBannedMethod() : VkMethod<VkList<OwnerXtrBanInfo>>(
    "groups.getBanned",
    HashMap()
) {

    var groupId: Long? by props
    var offset: Long? by props
    var count: Long? by props
    var fields: Array<String>? by props
    var userId: Long? by props

    constructor(
        groupId: Long? = null,
        offset: Long? = null,
        count: Long? = null,
        fields: Array<String>? = null,
        userId: Long? = null
    ) : this() {
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

    override val classRef = GroupsGetBannedMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<OwnerXtrBanInfo>>>() {}
    }
}
