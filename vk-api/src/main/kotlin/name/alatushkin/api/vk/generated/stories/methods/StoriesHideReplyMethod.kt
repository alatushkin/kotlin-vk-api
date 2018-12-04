package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Hides the reply to the current user's story.
 *
 *  [https://vk.com/dev/stories.hideReply]
 *  @property [owner_id] ID of the user whose replies should be hidden.
 *  @property [story_id] Story ID.
 *  @property [access_key] Access key for the private object.
 */
class StoriesHideReplyMethod() : VkMethod<Boolean>(
    "stories.hideReply",
    HashMap()
) {

    var ownerId: Long? by props
    var storyId: Long? by props
    var accessKey: String? by props

    constructor(
        ownerId: Long? = null,
        storyId: Long? = null,
        accessKey: String? = null
    ) : this() {
        this.ownerId = ownerId
        this.storyId = storyId
        this.accessKey = accessKey
    }

    fun setOwnerId(ownerId: Long): StoriesHideReplyMethod {
        this.ownerId = ownerId
        return this
    }

    fun setStoryId(storyId: Long): StoriesHideReplyMethod {
        this.storyId = storyId
        return this
    }

    fun setAccessKey(accessKey: String): StoriesHideReplyMethod {
        this.accessKey = accessKey
        return this
    }

    override val classRef = StoriesHideReplyMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
