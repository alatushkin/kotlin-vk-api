package name.alatushkin.api.vk.generated.notes

import name.alatushkin.api.vk.api.VkDate

open class Note(
    val id: Long,
    val ownerId: Long,
    val comments: Long,
    val canComment: Boolean? = null,
    val date: VkDate,
    val title: String,
    val text: String? = null,
    val textWiki: String? = null,
    val viewUrl: String
)