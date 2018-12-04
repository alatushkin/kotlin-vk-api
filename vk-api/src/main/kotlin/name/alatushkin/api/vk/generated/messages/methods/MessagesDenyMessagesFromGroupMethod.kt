package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Denies sending message from community to the current user.
 *
 *  [https://vk.com/dev/messages.denyMessagesFromGroup]
 *  @property [group_id] Group ID.
 */
class MessagesDenyMessagesFromGroupMethod() : VkMethod<Boolean>(
    "messages.denyMessagesFromGroup",
    HashMap()
) {

    var groupId: Long? by props

    constructor(
        groupId: Long? = null
    ) : this() {
        this.groupId = groupId
    }

    fun setGroupId(groupId: Long): MessagesDenyMessagesFromGroupMethod {
        this.groupId = groupId
        return this
    }

    override val classRef = MessagesDenyMessagesFromGroupMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
