package name.alatushkin.api.vk.generated.newsfeed

import name.alatushkin.api.vk.generated.groups.GroupFull
import name.alatushkin.api.vk.generated.users.UserFull

open class GetBannedExtendedResponse(
    val groups: Array<UserFull>? = null,
    val members: Array<GroupFull>? = null
)
