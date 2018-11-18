package name.alatushkin.api.vk.longpoll

import com.fasterxml.jackson.databind.JsonNode

open class MessageFlagsReset(jsonNodeArray: JsonNode) : MessageDeleted(jsonNodeArray) {
    internal var flags: Long = 0

    val isUnread: Boolean
        get() = flags and 1 > 0

    val isOutbox: Boolean
        get() = flags and 2 > 0

    val isReplied: Boolean
        get() = flags and 4 > 0

    val isImportant: Boolean
        get() = flags and 8 > 0

    val isThroughtChat: Boolean
        get() = flags and 16 > 0

    val isFromFriend: Boolean
        get() = flags and 32 > 0

    val isSpam: Boolean
        get() = flags and 64 > 0

    val isDeleted: Boolean
        get() = flags and 128 > 0

    val isFixed: Boolean
        get() = flags and 256 > 0

    val isMedia: Boolean
        get() = flags and 512 > 0

    init {
        flags = jsonNodeArray.get(2).asLong()
    }
}
