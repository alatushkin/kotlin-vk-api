package name.alatushkin.api.vk.generated.wall

import name.alatushkin.api.vk.generated.groups.Group
import name.alatushkin.api.vk.generated.users.User

open class GetCommentsExtendedResponse(
    val count: Long,
    val items: Array<WallComment>,
    val profiles: Array<User>,
    val groups: Array<Group>
)