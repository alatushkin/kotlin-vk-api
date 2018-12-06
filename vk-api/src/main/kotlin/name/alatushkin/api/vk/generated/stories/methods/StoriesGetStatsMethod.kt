@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stories.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.stories.StoryStats
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserGroupMethod {

    var ownerId: Long by props
    var storyId: Long by props

    init {
        this.ownerId = ownerId
        this.storyId = storyId
    }
}
