package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.groups.LongPollSettings

/**
 *  Returns Long Poll notification settings
 *
 *  [https://vk.com/dev/groups.getLongPollSettings]
 *  @property [group_id] Community ID.
 */
class GroupsGetLongPollSettingsMethod() : VkMethod<LongPollSettings>(
    "groups.getLongPollSettings",
    HashMap()
) {

    var groupId: Long? by props

    constructor(
        groupId: Long? = null
    ) : this() {
        this.groupId = groupId
    }

    fun setGroupId(groupId: Long): GroupsGetLongPollSettingsMethod {
        this.groupId = groupId
        return this
    }

    override val classRef = GroupsGetLongPollSettingsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<LongPollSettings>>() {}
    }
}
