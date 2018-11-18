package name.alatushkin.api.vk.generated.photos

import name.alatushkin.api.vk.api.VkDate

open class PhotoXtrTagInfo(
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
    val lat: Long? = null,
    val long: Long? = null,
    val accessKey: String? = null,
    val placerId: Long? = null,
    val tagCreated: Long? = null,
    val tagId: Long? = null
)