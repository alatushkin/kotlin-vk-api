package name.alatushkin.api.vk.generated.notifications

import name.alatushkin.api.vk.api.VkDate
import name.alatushkin.api.vk.generated.board.Topic
import name.alatushkin.api.vk.generated.photos.Photo
import name.alatushkin.api.vk.generated.video.Video
import name.alatushkin.api.vk.generated.wall.Wallpost

open class NotificationsComment(
    val id: Long? = null,
    val ownerId: Long? = null,
    val date: VkDate? = null,
    val text: String? = null,
    val photo: Photo? = null,
    val video: Video? = null,
    val post: Wallpost? = null,
    val topic: Topic? = null
) : NotificationParent
