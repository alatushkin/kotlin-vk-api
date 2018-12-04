package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.groups.LongPollServer

/**
 *  Returns the data needed to query a Long Poll server for events
 *
 *  [https://vk.com/dev/groups.getLongPollServer]
 *  @property [group_id] Community ID
 */
class GroupsGetLongPollServerMethod() : VkMethod<LongPollServer>(
    "groups.getLongPollServer",
    HashMap()
) {

    var groupId: Long? by props

    constructor(
        groupId: Long? = null
    ) : this() {
        this.groupId = groupId
    }

    fun setGroupId(groupId: Long): GroupsGetLongPollServerMethod {
        this.groupId = groupId
        return this
    }

    override val classRef = GroupsGetLongPollServerMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<LongPollServer>>() {}
    }
}
