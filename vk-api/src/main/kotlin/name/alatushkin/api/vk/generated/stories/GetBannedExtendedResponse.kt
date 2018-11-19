package name.alatushkin.api.vk.generated.stories

import name.alatushkin.api.vk.generated.groups.GroupFull
import name.alatushkin.api.vk.generated.users.UserFull

open class GetBannedExtendedResponse(
    val count: Long,
    val items: Array<Long>,
    val profiles: Array<UserFull>,
    val groups: Array<GroupFull>
)