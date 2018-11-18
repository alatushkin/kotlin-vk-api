package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.messages.IsMessagesFromGroupAllowedResponse

/**
 *  Returns information whether sending messages from the community to current user is allowed.
 *
 *  [https://vk.com/dev/messages.isMessagesFromGroupAllowed]
 *  @property [group_id] Group ID.
 *  @property [user_id] User ID.
 */
class MessagesIsMessagesFromGroupAllowedMethod() : VkMethod<IsMessagesFromGroupAllowedResponse>(
    "messages.isMessagesFromGroupAllowed",
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

    fun setGroupId(groupId: Long): MessagesIsMessagesFromGroupAllowedMethod {
        this.groupId = groupId
        return this
    }

    fun setUserId(userId: Long): MessagesIsMessagesFromGroupAllowedMethod {
        this.userId = userId
        return this
    }

    override val classRef = MessagesIsMessagesFromGroupAllowedMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<IsMessagesFromGroupAllowedResponse>>() {}
    }
}
