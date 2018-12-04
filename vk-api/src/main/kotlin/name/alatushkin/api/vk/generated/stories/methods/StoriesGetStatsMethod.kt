@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.stories.StoryStats
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/stories.getStats]
 *
 * Returns stories available for current user.
 *
 * @property ownerId Story owner ID.
 * @property storyId Story ID.
 */
class StoriesGetStatsMethod(
        ownerId: Long,
        storyId: Long
) : VkMethod<StoryStats>(
    "stories.getStats",
    mutableMapOf(),
    object : TypeReference<VkSuccess<StoryStats>>() {}
), UserGroupMethod {

    var ownerId: Long by props
    var storyId: Long by props

    init {
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
}
