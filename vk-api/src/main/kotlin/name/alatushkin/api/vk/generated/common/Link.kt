package name.alatushkin.api.vk.generated.common

import name.alatushkin.api.vk.generated.messages.MessageAttachment
import name.alatushkin.api.vk.generated.photos.Photo
import name.alatushkin.api.vk.generated.wall.CommentAttachment
import name.alatushkin.api.vk.generated.wall.WallpostAttachment

open class Link(
    val target: LinkTarget? = null,
    val isExternal: Boolean? = null,
    val url: String,
    val title: String? = null,
    val caption: String? = null,
    val description: String? = null,
    val photo: Photo? = null,
    val previewUrl: String? = null,
    val previewPage: String? = null,
    val button: LinkButton? = null,
    val product: LinkProduct? = null,
    val rating: LinkRating? = null,
    val application: LinkApplication? = null
) : WallpostAttachment,
    CommentAttachment,
    MessageAttachment
