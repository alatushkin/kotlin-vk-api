package name.alatushkin.api.vk.generated.photos

import name.alatushkin.api.vk.generated.groups.GroupFull
import name.alatushkin.api.vk.generated.users.UserFull
import name.alatushkin.api.vk.generated.wall.WallComment

open class GetCommentsExtendedResponse(
    val count: Long,
    val realOffset: Long? = null,
    val items: Array<WallComment>,
    val profiles: Array<UserFull>,
    val groups: Array<GroupFull>
)