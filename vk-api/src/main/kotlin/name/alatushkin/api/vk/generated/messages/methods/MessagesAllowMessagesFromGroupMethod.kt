package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Allows sending messages from community to the current user.
 *
 *  [https://vk.com/dev/messages.allowMessagesFromGroup]
 *  @property [group_id] Group ID.
 */
class MessagesAllowMessagesFromGroupMethod() : VkMethod<Boolean>(
    "messages.allowMessagesFromGroup",
    HashMap()
) {

    var groupId: Long? by props

    constructor(
        groupId: Long? = null
    ) : this() {
        this.groupId = groupId
    }

    fun setGroupId(groupId: Long): MessagesAllowMessagesFromGroupMethod {
        this.groupId = groupId
        return this
    }

    override val classRef = MessagesAllowMessagesFromGroupMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
