package name.alatushkin.api.vk.generated.video

import name.alatushkin.api.vk.generated.groups.GroupFull
import name.alatushkin.api.vk.generated.users.UserFull

open class GetCatalogExtendedResponse(
    val items: Array<CatBlock>,
    val profiles: Array<UserFull>,
    val groups: Array<GroupFull>,
    val next: String
)