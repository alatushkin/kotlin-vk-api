package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Changes the status of a user as typing in a conversation.
 *
 *  [https://vk.com/dev/messages.setActivity]
 *  @property [user_id] User ID.
 *  @property [type] 'typing' — user has started to type.
 *  @property [peer_id] Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
 *  @property [group_id] Group ID (for group messages with group access token)
 */
class MessagesSetActivityMethod() : VkMethod<Boolean>(
    "messages.setActivity",
    HashMap()
) {

    var userId: String? by props
    var type: String? by props
    var peerId: Long? by props
    var groupId: Long? by props

    constructor(
        userId: String? = null,
        type: String? = null,
        peerId: Long? = null,
        groupId: Long? = null
    ) : this() {
        this.userId = userId
        this.type = type
        this.peerId = peerId
        this.groupId = groupId
    }

    fun setUserId(userId: String): MessagesSetActivityMethod {
        this.userId = userId
        return this
    }

    fun setType(type: String): MessagesSetActivityMethod {
        this.type = type
        return this
    }

    fun setPeerId(peerId: Long): MessagesSetActivityMethod {
        this.peerId = peerId
        return this
    }

    fun setGroupId(groupId: Long): MessagesSetActivityMethod {
        this.groupId = groupId
        return this
    }

    override val classRef = MessagesSetActivityMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
