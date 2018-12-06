package name.alatushkin.api.vk.generated.wall

import name.alatushkin.api.vk.generated.groups.Group
import name.alatushkin.api.vk.generated.users.User

open class GetRepostsResponse(
    val items: Array<WallpostFull>,
    val profiles: Array<User>,
    val groups: Array<Group>
)
