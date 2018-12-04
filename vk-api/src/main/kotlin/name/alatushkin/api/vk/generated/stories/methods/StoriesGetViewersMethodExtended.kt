@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.users.UserFull
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/stories.getViewers]
 *
 * Returns a list of story viewers.
 *
 * @property ownerId Story owner ID.
 * @property storyId Story ID.
 * @property count Maximum number of results.
 * @property offset Offset needed to return a specific subset of results.
 */
class StoriesGetViewersMethodExtended(
        ownerId: Long,
        storyId: Long,
        count: Long? = null,
        offset: Long? = null
) : VkMethod<VkList<UserFull>>(
    "stories.getViewers",
    mutableMapOf("extended" to "1"),
    object : TypeReference<VkSuccess<VkList<UserFull>>>() {}
), UserGroupMethod {

    var ownerId: Long by props
    var storyId: Long by props
    var count: Long? by props
    var offset: Long? by props

    init {
        this.ownerId = ownerId
        this.storyId = storyId
        this.count = count
        this.offset = offset
    }

    fun setOwnerId(ownerId: Long): StoriesGetViewersMethodExtended {
        this.ownerId = ownerId
        return this
    }

    fun setStoryId(storyId: Long): StoriesGetViewersMethodExtended {
        this.storyId = storyId
        return this
    }

    fun setCount(count: Long): StoriesGetViewersMethodExtended {
        this.count = count
        return this
    }

    fun setOffset(offset: Long): StoriesGetViewersMethodExtended {
        this.offset = offset
        return this
    }
}
