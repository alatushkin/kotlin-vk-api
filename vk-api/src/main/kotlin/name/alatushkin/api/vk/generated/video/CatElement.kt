package name.alatushkin.api.vk.generated.video

import name.alatushkin.api.vk.api.VkDate

open class CatElement(
    val id: Long,
    val ownerId: Long,
    val title: String,
    val type: CatElementType,
    val description: String? = null,
    val duration: Long? = null,
    val photo130: String? = null,
    val photo160: String? = null,
    val photo320: String? = null,
    val photo640: String? = null,
    val photo800: String? = null,
    val date: VkDate? = null,
    val views: Long? = null,
    val comments: Long? = null,
    val canAdd: Boolean? = null,
    val canEdit: Boolean? = null,
    val isPrivate: Boolean? = null,
    val count: Long? = null,
    val updatedTime: Long? = null
)
