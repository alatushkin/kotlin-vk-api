package name.alatushkin.api.vk.generated.database

import name.alatushkin.api.vk.generated.common.Object

open class City(
    val area: String? = null,
    val region: String? = null,
    val important: Boolean? = null,
    override val id: Long,
    override val title: String
) : Object
