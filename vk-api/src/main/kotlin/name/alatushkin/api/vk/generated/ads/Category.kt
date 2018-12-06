package name.alatushkin.api.vk.generated.ads

import name.alatushkin.api.vk.generated.common.ObjectWithName

open class Category(
    val id: Long,
    val name: String,
    val subcategories: Array<ObjectWithName>? = null
)
