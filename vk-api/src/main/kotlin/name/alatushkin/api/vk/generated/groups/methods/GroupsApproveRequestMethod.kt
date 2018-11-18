package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Allows to approve join request to the community.
 *
 *  [https://vk.com/dev/groups.approveRequest]
 *  @property [group_id] Community ID.
 *  @property [user_id] User ID.
 */
class GroupsApproveRequestMethod() : VkMethod<Boolean>(
    "groups.approveRequest",
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

    fun setGroupId(groupId: Long): GroupsApproveRequestMethod {
        this.groupId = groupId
        return this
    }

    fun setUserId(userId: Long): GroupsApproveRequestMethod {
        this.userId = userId
        return this
    }

    override val classRef = GroupsApproveRequestMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
