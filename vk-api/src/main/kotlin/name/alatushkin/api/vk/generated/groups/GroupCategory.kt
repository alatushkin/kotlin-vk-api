package name.alatushkin.api.vk.generated.groups

import name.alatushkin.api.vk.generated.common.ObjectWithName

open class GroupCategory(
    val id: Long,
    val name: String,
    val subcategories: Array<ObjectWithName>? = null
)