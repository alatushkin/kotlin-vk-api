package name.alatushkin.api.vk.generated.photos

import name.alatushkin.api.vk.api.VkDate

open class PhotoTag(
    val userId: Long,
    val id: Long,
    val placerId: Long,
    val taggedName: String,
    val date: VkDate,
    val x: Long,
    val y: Long,
    val x2: Long,
    val y2: Long,
    val viewed: Boolean
)