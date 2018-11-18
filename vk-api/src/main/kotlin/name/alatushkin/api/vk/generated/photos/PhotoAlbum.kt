package name.alatushkin.api.vk.generated.photos

import name.alatushkin.api.vk.generated.wall.WallpostAttachment

open class PhotoAlbum(
    val id: Long,
    val thumb: Photo? = null,
    val ownerId: Long,
    val title: String,
    val description: String? = null,
    val created: Long,
    val updated: Long,
    val size: Long
) : WallpostAttachment