package name.alatushkin.api.vk.generated.stories

import name.alatushkin.api.vk.api.VkDate
import name.alatushkin.api.vk.generated.photos.Photo

open class Story(
    val id: Long,
    val ownerId: Long,
    val date: VkDate? = null,
    val seen: Boolean? = null,
    val type: StoryType? = null,
    val photo: Photo? = null,
    val video: StoryVideo? = null,
    val views: Long? = null,
    val canSee: Boolean? = null,
    val canReply: Boolean? = null,
    val canShare: Boolean? = null,
    val canComment: Boolean? = null,
    val isDeleted: Boolean? = null,
    val isExpired: Boolean? = null,
    val accessKey: String? = null,
    val parentStoryOwnerId: Long? = null,
    val parentStoryId: Long? = null,
    val parentStoryAccessKey: String? = null,
    val parentStory: Story? = null,
    val link: StoryLink? = null,
    val replies: Array<Replies>? = null
)
