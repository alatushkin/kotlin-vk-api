package name.alatushkin.api.vk.generated.status.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.status.Status

/**
 *  Returns data required to show the status of a user or community.
 *
 *  [https://vk.com/dev/status.get]
 *  @property [user_id] User ID or community ID. Use a negative value to designate a community ID.
 *  @property [group_id] null
 */
class StatusGetMethod() : VkMethod<Status>(
    "status.get",
    HashMap()
) {

    var userId: Long? by props
    var groupId: Long? by props

    constructor(
        userId: Long? = null,
        groupId: Long? = null
    ) : this() {
        this.userId = userId
        this.groupId = groupId
    }

    fun setUserId(userId: Long): StatusGetMethod {
        this.userId = userId
        return this
    }

    fun setGroupId(groupId: Long): StatusGetMethod {
        this.groupId = groupId
        return this
    }

    override val classRef = StatusGetMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Status>>() {}
    }
}
