package name.alatushkin.api.vk.generated.messages

import name.alatushkin.api.vk.generated.groups.GroupFull
import name.alatushkin.api.vk.generated.users.UserFull

open class GetConversationsResponse(
    val count: Long,
    val unreadCount: Long? = null,
    val items: Array<ConversationWithMessage>,
    val profiles: Array<UserFull>? = null,
    val groups: Array<GroupFull>? = null
)
