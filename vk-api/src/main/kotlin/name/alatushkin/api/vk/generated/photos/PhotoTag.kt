package name.alatushkin.api.vk.generated.photos

import name.alatushkin.api.vk.api.VkDate

open class PhotoTag(
    val userId: Long,
    val id: Long,
    val placerId: Long,
    val taggedName: String,
    val date: VkDate,
    val x: Double,
    val y: Double,
    val x2: Double,
    val y2: Double,
    val viewed: Boolean
)
