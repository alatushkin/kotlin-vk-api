package name.alatushkin.api.vk.generated.photos

import name.alatushkin.api.vk.api.VkDate
import name.alatushkin.api.vk.generated.common.Likes
import name.alatushkin.api.vk.generated.common.ObjectCount

open class PhotoFullXtrRealOffset(
    val id: Long,
    val albumId: Long,
    val ownerId: Long,
    val userId: Long? = null,
    val sizes: Array<PhotoSizes>? = null,
    val photo75: String? = null,
    val photo130: String? = null,
    val photo604: String? = null,
    val photo807: String? = null,
    val photo1280: String? = null,
    val photo2560: String? = null,
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
    val tags: ObjectCount? = null,
    val hidden: Boolean? = null,
    val realOffset: Long? = null
)