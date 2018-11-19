package name.alatushkin.api.vk.generated.stories

import name.alatushkin.api.vk.generated.groups.Group
import name.alatushkin.api.vk.generated.users.User

open class GetExtendedResponse(
    val count: Long,
    val items: Array<Array<Story>>,
    val profiles: Array<User>,
    val groups: Array<Group>
)