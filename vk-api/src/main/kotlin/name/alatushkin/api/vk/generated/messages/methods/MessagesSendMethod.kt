@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.messages.Keyboard
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/messages.send]
 *
 * Sends a message.
 *
 * @property userId User ID (by default — current user).
 * @property randomId Unique identifier to avoid resending the message.
 * @property peerId Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
 * @property domain User's short address (for example, 'illarionov').
 * @property chatId ID of conversation the message will relate to.
 * @property userIds IDs of message recipients (if new conversation shall be started).
 * @property message (Required if 'attachments' is not set.) Text of the message.
 * @property lat Geographical latitude of a check-in, in degrees (from -90 to 90).
 * @property long Geographical longitude of a check-in, in degrees (from -180 to 180).
 * @property attachment (Required if 'message' is not set.) List of objects attached to the message, separated by commas, in the following format: "<owner_id>_<media_id>", '' — Type of media attachment: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, 'wall' — wall post, '<owner_id>' — ID of the media attachment owner. '<media_id>' — media attachment ID. Example: "photo100172_166443618"
 * @property forwardMessages ID of forwarded messages, separated with a comma. Listed messages of the sender will be shown in the message body at the recipient's. Example: "123,431,544"
 * @property stickerId Sticker id.
 * @property notification '1' if the message is a notification (for community messages).
 * @property groupId Group ID (for group messages with group access token)
 * @property keyboard keyboard to message
 */
class MessagesSendMethod(
        userId: Long? = null,
        randomId: Long? = null,
        peerId: Long? = null,
        domain: String? = null,
        chatId: Long? = null,
        userIds: Array<Long>? = null,
        message: String? = null,
        lat: Double? = null,
        long: Double? = null,
        attachment: Array<String>? = null,
        forwardMessages: String? = null,
        stickerId: Long? = null,
        notification: Boolean? = null,
        groupId: Long? = null,
        keyboard: Keyboard? = null
) : VkMethod<Long>(
    "messages.send",
    mutableMapOf(),
    object : TypeReference<VkResponse<Long>>() {}
), UserGroupMethod {

    var userId: Long? by props
    var randomId: Long? by props
    var peerId: Long? by props
    var domain: String? by props
    var chatId: Long? by props
    var userIds: Array<Long>? by props
    var message: String? by props
    var lat: Double? by props
    var long: Double? by props
    var attachment: Array<String>? by props
    var forwardMessages: String? by props
    var stickerId: Long? by props
    var notification: Boolean? by props
    var groupId: Long? by props
    var keyboard: Keyboard? by props

    init {
        this.userId = userId
        this.randomId = randomId
        this.peerId = peerId
        this.domain = domain
        this.chatId = chatId
        this.userIds = userIds
        this.message = message
        this.lat = lat
        this.long = long
        this.attachment = attachment
        this.forwardMessages = forwardMessages
        this.stickerId = stickerId
        this.notification = notification
        this.groupId = groupId
        this.keyboard = keyboard
    }

    fun setUserId(userId: Long): MessagesSendMethod {
        this.userId = userId
        return this
    }

    fun setRandomId(randomId: Long): MessagesSendMethod {
        this.randomId = randomId
        return this
    }

    fun setPeerId(peerId: Long): MessagesSendMethod {
        this.peerId = peerId
        return this
    }

    fun setDomain(domain: String): MessagesSendMethod {
        this.domain = domain
        return this
    }

    fun setChatId(chatId: Long): MessagesSendMethod {
        this.chatId = chatId
        return this
    }

    fun setUserIds(userIds: Array<Long>): MessagesSendMethod {
        this.userIds = userIds
        return this
    }

    fun setMessage(message: String): MessagesSendMethod {
        this.message = message
        return this
    }

    fun setLat(lat: Double): MessagesSendMethod {
        this.lat = lat
        return this
    }

    fun setLong(long: Double): MessagesSendMethod {
        this.long = long
        return this
    }

    fun setAttachment(attachment: Array<String>): MessagesSendMethod {
        this.attachment = attachment
        return this
    }

    fun setForwardMessages(forwardMessages: String): MessagesSendMethod {
        this.forwardMessages = forwardMessages
        return this
    }

    fun setStickerId(stickerId: Long): MessagesSendMethod {
        this.stickerId = stickerId
        return this
    }

    fun setNotification(notification: Boolean): MessagesSendMethod {
        this.notification = notification
        return this
    }

    fun setGroupId(groupId: Long): MessagesSendMethod {
        this.groupId = groupId
        return this
    }

    fun setKeyboard(keyboard: Keyboard): MessagesSendMethod {
        this.keyboard = keyboard
        return this
    }
}
