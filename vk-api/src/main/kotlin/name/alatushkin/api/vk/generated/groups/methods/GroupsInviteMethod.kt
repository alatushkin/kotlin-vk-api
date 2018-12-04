package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Allows to invite friends to the community.
 *
 *  [https://vk.com/dev/groups.invite]
 *  @property [group_id] Community ID.
 *  @property [user_id] User ID.
 */
class GroupsInviteMethod() : VkMethod<Boolean>(
    "groups.invite",
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

    fun setGroupId(groupId: Long): GroupsInviteMethod {
        this.groupId = groupId
        return this
    }

    fun setUserId(userId: Long): GroupsInviteMethod {
        this.userId = userId
        return this
    }

    override val classRef = GroupsInviteMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
