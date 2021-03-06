package name.alatushkin.api.vk.generated.wall

import name.alatushkin.api.vk.generated.groups.GroupFull
import name.alatushkin.api.vk.generated.users.UserFull

open class GetByIdExtendedResponse(
    val items: Array<WallpostFull>,
    val profiles: Array<UserFull>,
    val groups: Array<GroupFull>
)