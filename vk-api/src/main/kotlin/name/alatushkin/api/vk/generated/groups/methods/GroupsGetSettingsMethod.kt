package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.groups.GroupSettings

/**
 *  Returns community settings.
 *
 *  [https://vk.com/dev/groups.getSettings]
 *  @property [group_id] Community ID.
 */
class GroupsGetSettingsMethod() : VkMethod<GroupSettings>(
    "groups.getSettings",
    HashMap()
) {

    var groupId: Long? by props

    constructor(
        groupId: Long? = null
    ) : this() {
        this.groupId = groupId
    }

    fun setGroupId(groupId: Long): GroupsGetSettingsMethod {
        this.groupId = groupId
        return this
    }

    override val classRef = GroupsGetSettingsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<GroupSettings>>() {}
    }
}
