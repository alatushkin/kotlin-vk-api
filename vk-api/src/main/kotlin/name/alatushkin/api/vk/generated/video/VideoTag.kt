package name.alatushkin.api.vk.generated.video

import name.alatushkin.api.vk.api.VkDate

open class VideoTag(
    val userId: Long,
    val id: Long,
    val placerId: Long,
    val taggedName: String,
    val date: VkDate,
    val viewed: Boolean
)