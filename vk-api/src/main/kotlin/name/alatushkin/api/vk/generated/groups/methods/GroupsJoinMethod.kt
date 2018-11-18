package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  With this method you can join the group or public page, and also confirm your participation in an event.
 *
 *  [https://vk.com/dev/groups.join]
 *  @property [group_id] ID or screen name of the community.
 *  @property [not_sure] Optional parameter which is taken into account when 'gid' belongs to the event: '1' — Perhaps I will attend, '0' — I will be there for sure (default), ,
 */
class GroupsJoinMethod() : VkMethod<Boolean>(
    "groups.join",
    HashMap()
) {

    var groupId: Long? by props
    var notSure: String? by props

    constructor(
        groupId: Long? = null,
        notSure: String? = null
    ) : this() {
        this.groupId = groupId
        this.notSure = notSure
    }

    fun setGroupId(groupId: Long): GroupsJoinMethod {
        this.groupId = groupId
        return this
    }

    fun setNotSure(notSure: String): GroupsJoinMethod {
        this.notSure = notSure
        return this
    }

    override val classRef = GroupsJoinMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
