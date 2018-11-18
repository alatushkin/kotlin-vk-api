package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.groups.IsMemberExtendedResponse

/**
 *  Returns information specifying whether a user is a member of a community.
 *
 *  [https://vk.com/dev/groups.isMember]
 *  @property [group_id] ID or screen name of the community.
 *  @property [user_ids] User IDs.
 */
class GroupsIsMemberMethodUserIdsExtended() : VkMethod<IsMemberExtendedResponse>(
    "groups.isMember",
    mutableMapOf("extended" to "1")
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

    fun setGroupId(groupId: String): GroupsIsMemberMethodUserIdsExtended {
        this.groupId = groupId
        return this
    }

    fun setUserIds(userIds: Array<Long>): GroupsIsMemberMethodUserIdsExtended {
        this.userIds = userIds
        return this
    }

    override val classRef = GroupsIsMemberMethodUserIdsExtended.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<IsMemberExtendedResponse>>() {}
    }
}
