package name.alatushkin.api.vk.generated.newsfeed

import name.alatushkin.api.vk.generated.groups.GroupFull
import name.alatushkin.api.vk.generated.users.UserFull
import name.alatushkin.api.vk.generated.wall.WallpostFull

open class SearchExtendedResponse(
    val items: Array<WallpostFull>? = null,
    val profiles: Array<UserFull>? = null,
    val groups: Array<GroupFull>? = null
)
