package name.alatushkin.api.vk.generated.video

import name.alatushkin.api.vk.generated.groups.GroupFull
import name.alatushkin.api.vk.generated.users.UserMin
import name.alatushkin.api.vk.generated.wall.WallComment

open class GetCommentsResponse(
    val count: Long,
    val items: Array<WallComment>,
    val profiles: Array<UserMin>,
    val groups: Array<GroupFull>
)
