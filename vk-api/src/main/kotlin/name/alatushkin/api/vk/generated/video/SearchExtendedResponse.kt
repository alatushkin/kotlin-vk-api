package name.alatushkin.api.vk.generated.video

import name.alatushkin.api.vk.generated.groups.GroupFull
import name.alatushkin.api.vk.generated.users.UserMin

open class SearchExtendedResponse(
    val count: Long,
    val items: Array<Video>,
    val profiles: Array<UserMin>,
    val groups: Array<GroupFull>
)