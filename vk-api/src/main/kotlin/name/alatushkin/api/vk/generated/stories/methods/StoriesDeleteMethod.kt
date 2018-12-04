package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Allows to delete story.
 *
 *  [https://vk.com/dev/stories.delete]
 *  @property [owner_id] Story owner's ID. Current user id is used by default.
 *  @property [story_id] Story ID.
 */
class StoriesDeleteMethod() : VkMethod<Boolean>(
    "stories.delete",
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

    fun setOwnerId(ownerId: Long): StoriesDeleteMethod {
        this.ownerId = ownerId
        return this
    }

    fun setStoryId(storyId: Long): StoriesDeleteMethod {
        this.storyId = storyId
        return this
    }

    override val classRef = StoriesDeleteMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
