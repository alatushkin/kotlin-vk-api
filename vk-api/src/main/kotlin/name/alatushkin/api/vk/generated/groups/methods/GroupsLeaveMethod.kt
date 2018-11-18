package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  With this method you can leave a group, public page, or event.
 *
 *  [https://vk.com/dev/groups.leave]
 *  @property [group_id] ID or screen name of the community.
 */
class GroupsLeaveMethod() : VkMethod<Boolean>(
    "groups.leave",
    HashMap()
) {

    var groupId: Long? by props

    constructor(
        groupId: Long? = null
    ) : this() {
        this.groupId = groupId
    }

    fun setGroupId(groupId: Long): GroupsLeaveMethod {
        this.groupId = groupId
        return this
    }

    override val classRef = GroupsLeaveMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
