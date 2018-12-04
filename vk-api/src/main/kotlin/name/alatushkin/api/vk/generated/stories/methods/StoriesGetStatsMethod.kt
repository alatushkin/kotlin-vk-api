package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.stories.StoryStats

/**
 *  Returns stories available for current user.
 *
 *  [https://vk.com/dev/stories.getStats]
 *  @property [owner_id] Story owner ID.
 *  @property [story_id] Story ID.
 */
class StoriesGetStatsMethod() : VkMethod<StoryStats>(
    "stories.getStats",
    HashMap()
) {

    var ownerId: Long? by props
    var storyId: Long? by props

    constructor(
        ownerId: Long? = null,
        storyId: Long? = null
    ) : this() {
        this.ownerId = ownerId
        this.storyId = storyId
    }

    fun setOwnerId(ownerId: Long): StoriesGetStatsMethod {
        this.ownerId = ownerId
        return this
    }

    fun setStoryId(storyId: Long): StoriesGetStatsMethod {
        this.storyId = storyId
        return this
    }

    override val classRef = StoriesGetStatsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<StoryStats>>() {}
    }
}
