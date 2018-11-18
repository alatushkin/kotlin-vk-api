package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Returns information specifying whether a user is a member of a community.
 *
 *  [https://vk.com/dev/groups.isMember]
 *  @property [group_id] ID or screen name of the community.
 *  @property [user_ids] User IDs.
 */
class GroupsIsMemberMethodUserIds() : VkMethod<Boolean>(
    "groups.isMember",
    mutableMapOf()
) {

    var groupId: String? by props
    var userIds: Array<Long>? by props

    constructor(
        groupId: String? = null,
        userIds: Array<Long>? = null
    ) : this() {
        this.groupId = groupId
        this.userIds = userIds
    }

    fun setGroupId(groupId: String): GroupsIsMemberMethodUserIds {
        this.groupId = groupId
        return this
    }

    fun setUserIds(userIds: Array<Long>): GroupsIsMemberMethodUserIds {
        this.userIds = userIds
        return this
    }

    override val classRef = GroupsIsMemberMethodUserIds.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
