@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/stories.delete]
 *
 * Allows to delete story.
 *
 * @property ownerId Story owner's ID. Current user id is used by default.
 * @property storyId Story ID.
 */
class StoriesDeleteMethod(
        ownerId: Long,
        storyId: Long
) : VkMethod<Boolean>(
    "stories.delete",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserGroupMethod {

    var ownerId: Long by props
    var storyId: Long by props

    init {
        this.ownerId = ownerId
        this.storyId = storyId
    }

    fun setOwnerId(ownerId: Long): StoriesDeleteMethod {
        this.ownerId = ownerId
        return this
    }

    fun setStoryId(storyId: Long): StoriesDeleteMethod {
        this.storyId = storyId
        return this
    }
}
