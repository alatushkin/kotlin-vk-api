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
 *  @property [user_id] User ID.
 */
class GroupsIsMemberMethodExtended() : VkMethod<IsMemberExtendedResponse>(
    "groups.isMember",
    mutableMapOf("extended" to "1")
) {

    var groupId: String? by props
    var userId: Long? by props

    constructor(
        groupId: String? = null,
        userId: Long? = null
    ) : this() {
        this.groupId = groupId
        this.userId = userId
    }

    fun setGroupId(groupId: String): GroupsIsMemberMethodExtended {
        this.groupId = groupId
        return this
    }

    fun setUserId(userId: Long): GroupsIsMemberMethodExtended {
        this.userId = userId
        return this
    }

    override val classRef = GroupsIsMemberMethodExtended.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<IsMemberExtendedResponse>>() {}
    }
}
