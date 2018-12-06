package name.alatushkin.api.vk.generated.messages

import name.alatushkin.api.vk.generated.groups.GroupFull
import name.alatushkin.api.vk.generated.users.UserFull

open class GetHistoryResponse(
    val count: Long,
    val items: Array<Message>,
    val profiles: Array<UserFull>? = null,
    val groups: Array<GroupFull>? = null
)
