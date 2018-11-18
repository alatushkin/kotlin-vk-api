package name.alatushkin.api.vk.generated.widgets

import name.alatushkin.api.vk.api.VkDate
import name.alatushkin.api.vk.generated.common.ObjectCount

open class WidgetPage(
    val id: Long? = null,
    val title: String? = null,
    val description: String? = null,
    val photo: String? = null,
    val url: String? = null,
    val likes: ObjectCount? = null,
    val comments: ObjectCount? = null,
    val date: VkDate? = null,
    val pageId: String? = null
)