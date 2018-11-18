package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Removes a user from a community blacklist.
 *
 *  [https://vk.com/dev/groups.unbanUser]
 *  @property [group_id] Community ID.
 *  @property [user_id] User ID.
 */
class GroupsUnbanUserMethod() : VkMethod<Boolean>(
    "groups.unbanUser",
    HashMap()
) {

    var groupId: Long? by props
    var userId: Long? by props

    constructor(
        groupId: Long? = null,
        userId: Long? = null
    ) : this() {
        this.groupId = groupId
        this.userId = userId
    }

    fun setGroupId(groupId: Long): GroupsUnbanUserMethod {
        this.groupId = groupId
        return this
    }

    fun setUserId(userId: Long): GroupsUnbanUserMethod {
        this.userId = userId
        return this
    }

    override val classRef = GroupsUnbanUserMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
