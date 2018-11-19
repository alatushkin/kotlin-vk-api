package name.alatushkin.api.vk.generated.notifications

import name.alatushkin.api.vk.generated.groups.Group
import name.alatushkin.api.vk.generated.users.User

open class GetResponse(
    val count: Long? = null,
    val items: Array<Notification>? = null,
    val profiles: Array<User>? = null,
    val groups: Array<Group>? = null,
    val lastViewed: Long? = null
)