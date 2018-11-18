package name.alatushkin.api.vk.generated.search

import name.alatushkin.api.vk.generated.groups.Group
import name.alatushkin.api.vk.generated.users.UserMin

open class Hint(
    val type: HintType,
    val section: HintSection,
    val description: String,
    val global: Boolean? = null,
    val group: Group? = null,
    val profile: UserMin? = null
)