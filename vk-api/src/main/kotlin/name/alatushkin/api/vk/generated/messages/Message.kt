package name.alatushkin.api.vk.generated.messages

import name.alatushkin.api.vk.api.VkDate
import name.alatushkin.api.vk.generated.common.Geo

open class Message(
    val id: Long,
    val conversationMessageId: Long? = null,
    val date: VkDate,
    val peerId: Long,
    val fromId: Long,
    val updateTime: Long? = null,
    val randomId: Long? = null,
    val important: Boolean? = null,
    val payload: String? = null,
    val text: String,
    val attachments: Array<MessageAttachment>? = null,
    val geo: Geo? = null,
    val action: MessageAction? = null,
    val keyboard: KeyboardReturned? = null
)