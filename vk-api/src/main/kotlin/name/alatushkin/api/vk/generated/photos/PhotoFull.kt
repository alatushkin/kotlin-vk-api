package name.alatushkin.api.vk.generated.photos

import name.alatushkin.api.vk.api.VkDate
import name.alatushkin.api.vk.generated.common.Likes
import name.alatushkin.api.vk.generated.common.ObjectCount

open class PhotoFull(
    val id: Long,
    val albumId: Long,
    val ownerId: Long,
    val userId: Long? = null,
    val sizes: Array<Image>? = null,
    val postId: Long? = null,
    val width: Long? = null,
    val height: Long? = null,
    val text: String? = null,
    val date: VkDate,
    val lat: Double? = null,
    val long: Double? = null,
    val accessKey: String? = null,
    val likes: Likes? = null,
    val reposts: ObjectCount? = null,
    val comments: ObjectCount? = null,
    val canComment: Boolean? = null,
    val tags: ObjectCount? = null
)
