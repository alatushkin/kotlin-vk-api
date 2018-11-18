package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Returns information specifying whether a user is a member of a community.
 *
 *  [https://vk.com/dev/groups.isMember]
 *  @property [group_id] ID or screen name of the community.
 *  @property [user_id] User ID.
 */
class GroupsIsMemberMethod() : VkMethod<Boolean>(
    "groups.isMember",
    mutableMapOf()
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

    fun setGroupId(groupId: String): GroupsIsMemberMethod {
        this.groupId = groupId
        return this
    }

    fun setUserId(userId: Long): GroupsIsMemberMethod {
        this.userId = userId
        return this
    }

    override val classRef = GroupsIsMemberMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
