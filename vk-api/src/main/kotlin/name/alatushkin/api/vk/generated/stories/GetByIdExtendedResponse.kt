package name.alatushkin.api.vk.generated.stories

import name.alatushkin.api.vk.generated.groups.GroupFull
import name.alatushkin.api.vk.generated.users.UserFull

open class GetByIdExtendedResponse(
    val count: Long,
    val items: Array<Story>,
    val profiles: Array<UserFull>,
    val groups: Array<GroupFull>
)