package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.groups.GetCallbackConfirmationCodeResponse

/**
 *  Returns Callback API confirmation code for the community.
 *
 *  [https://vk.com/dev/groups.getCallbackConfirmationCode]
 *  @property [group_id] Community ID.
 */
class GroupsGetCallbackConfirmationCodeMethod() : VkMethod<GetCallbackConfirmationCodeResponse>(
    "groups.getCallbackConfirmationCode",
    HashMap()
) {

    var groupId: Long? by props

    constructor(
        groupId: Long? = null
    ) : this() {
        this.groupId = groupId
    }

    fun setGroupId(groupId: Long): GroupsGetCallbackConfirmationCodeMethod {
        this.groupId = groupId
        return this
    }

    override val classRef = GroupsGetCallbackConfirmationCodeMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<GetCallbackConfirmationCodeResponse>>() {}
    }
}
