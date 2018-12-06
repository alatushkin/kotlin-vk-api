package name.alatushkin.api.vk.generated.notifications

import name.alatushkin.api.vk.generated.common.Geo
import name.alatushkin.api.vk.generated.common.LikesInfo
import name.alatushkin.api.vk.generated.wall.WallpostAttachment

open class Feedback(
    val id: Long? = null,
    val toId: Long? = null,
    val fromId: Long? = null,
    val text: String? = null,
    val likes: LikesInfo? = null,
    val attachments: Array<WallpostAttachment>? = null,
    val geo: Geo? = null
)
