package name.alatushkin.api.vk.generated.messages

import name.alatushkin.api.vk.generated.groups.Group
import name.alatushkin.api.vk.generated.users.UserFull

open class GetLongPollHistoryResponse(
    val history: Array<Array<Long>>? = null,
    val groups: Array<Group>? = null,
    val messages: LongpollMessages? = null,
    val profiles: Array<UserFull>? = null,
    val chats: Array<Chat>? = null,
    val newPts: Long? = null,
    val more: Boolean? = null
)