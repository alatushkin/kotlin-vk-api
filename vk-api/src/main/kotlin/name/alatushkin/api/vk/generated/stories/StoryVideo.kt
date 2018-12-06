package name.alatushkin.api.vk.generated.stories

import name.alatushkin.api.vk.api.VkDate
import name.alatushkin.api.vk.generated.video.Video
import name.alatushkin.api.vk.generated.video.VideoFiles

open class StoryVideo(
    val firstFrame800: String? = null,
    val firstFrame320: String? = null,
    val firstFrame160: String? = null,
    val firstFrame130: String? = null,
    val isPrivate: Boolean? = null,
    override val id: Long? = null,
    override val ownerId: Long? = null,
    override val title: String? = null,
    override val duration: Long? = null,
    override val description: String? = null,
    override val date: VkDate? = null,
    override val views: Long? = null,
    override val comments: Long? = null,
    override val photo130: String? = null,
    override val photo320: String? = null,
    override val photo640: String? = null,
    override val photo800: String? = null,
    override val accessKey: String? = null,
    override val addingDate: Long? = null,
    override val player: String? = null,
    override val canEdit: Boolean? = null,
    override val canAdd: Boolean? = null,
    override val processing: Boolean? = null,
    override val live: Boolean? = null,
    override val files: VideoFiles? = null,
    override val platform: String? = null,
    override val width: Long? = null,
    override val height: Long? = null
) : Video
