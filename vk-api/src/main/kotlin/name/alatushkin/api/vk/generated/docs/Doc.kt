package name.alatushkin.api.vk.generated.docs

import name.alatushkin.api.vk.api.VkDate
import name.alatushkin.api.vk.generated.messages.MessageAttachment
import name.alatushkin.api.vk.generated.wall.CommentAttachment
import name.alatushkin.api.vk.generated.wall.WallpostAttachment

open class Doc(
    val id: Long,
    val ownerId: Long,
    val title: String,
    val size: Long,
    val ext: String,
    val url: String? = null,
    val date: VkDate,
    val type: DocType,
    val preview: DocPreview? = null,
    val accessKey: String? = null
) : WallpostAttachment,
    CommentAttachment,
    MessageAttachment