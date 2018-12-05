@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/messages.setActivity]
 *
 * Changes the status of a user as typing in a conversation.
 *
 * @property userId User ID.
 * @property type 'typing' — user has started to type.
 * @property peerId Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
 * @property groupId Group ID (for group messages with group access token)
 */
class MessagesSetActivityMethod(
        userId: String? = null,
        type: String? = null,
        peerId: Long? = null,
        groupId: Long? = null
) : VkMethod<Boolean>(
    "messages.setActivity",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserGroupMethod {

    var userId: String? by props
    var type: String? by props
    var peerId: Long? by props
    var groupId: Long? by props

    init {
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
}
