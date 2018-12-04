package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Returns a list of story viewers.
 *
 *  [https://vk.com/dev/stories.getViewers]
 *  @property [owner_id] Story owner ID.
 *  @property [story_id] Story ID.
 *  @property [count] Maximum number of results.
 *  @property [offset] Offset needed to return a specific subset of results.
 */
class StoriesGetViewersMethod() : VkMethod<VkList<Long>>(
    "stories.getViewers",
    mutableMapOf()
) {

    var ownerId: Long? by props
    var storyId: Long? by props
    var count: Long? by props
    var offset: Long? by props

    constructor(
        ownerId: Long? = null,
        storyId: Long? = null,
        count: Long? = null,
        offset: Long? = null
    ) : this() {
        this.ownerId = ownerId
        this.storyId = storyId
        this.count = count
        this.offset = offset
    }

    fun setOwnerId(ownerId: Long): StoriesGetViewersMethod {
        this.ownerId = ownerId
        return this
    }

    fun setStoryId(storyId: Long): StoriesGetViewersMethod {
        this.storyId = storyId
        return this
    }

    fun setCount(count: Long): StoriesGetViewersMethod {
        this.count = count
        return this
    }

    fun setOffset(offset: Long): StoriesGetViewersMethod {
        this.offset = offset
        return this
    }

    override val classRef = StoriesGetViewersMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<VkList<Long>>>() {}
    }
}
