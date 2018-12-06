package name.alatushkin.api.vk.generated.video

import name.alatushkin.api.vk.api.VkDate
import name.alatushkin.api.vk.generated.common.Likes

open class VideoFull(
    val id: Long? = null,
    val ownerId: Long? = null,
    val title: String? = null,
    val duration: Long? = null,
    val description: String? = null,
    val date: VkDate? = null,
    val views: Long? = null,
    val comments: Long? = null,
    val photo130: String? = null,
    val photo320: String? = null,
    val photo800: String? = null,
    val accessKey: String? = null,
    val addingDate: Long? = null,
    val player: String? = null,
    val canEdit: Boolean? = null,
    val canAdd: Boolean? = null,
    val processing: Boolean? = null,
    val live: Boolean? = null,
    val files: VideoFiles? = null,
    val privacyView: Array<String>? = null,
    val privacyComment: Array<String>? = null,
    val canComment: Boolean? = null,
    val canRepost: Boolean? = null,
    val likes: Likes? = null,
    val repeat: Boolean? = null
)
