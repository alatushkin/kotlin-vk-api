package name.alatushkin.api.vk.generated.newsfeed

import name.alatushkin.api.vk.generated.groups.GroupFull
import name.alatushkin.api.vk.generated.users.UserFull

open class GetResponse(
    val items: Array<NewsfeedItem>? = null,
    val profiles: Array<UserFull>? = null,
    val groups: Array<GroupFull>? = null
)