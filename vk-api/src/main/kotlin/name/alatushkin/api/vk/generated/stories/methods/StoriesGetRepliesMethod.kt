package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.stories.Story

/**
 *  Returns replies to the story.
 *
 *  [https://vk.com/dev/stories.getReplies]
 *  @property [owner_id] Story owner ID.
 *  @property [story_id] Story ID.
 *  @property [access_key] Access key for the private object.
 *  @property [fields] Additional fields to return
 */
class StoriesGetRepliesMethod() : VkMethod<VkList<Array<Story>>>(
    "stories.getReplies",
    mutableMapOf()
) {

    var ownerId: Long? by props
    var storyId: Long? by props
    var accessKey: String? by props
    var fields: Array<String>? by props

    constructor(
        ownerId: Long? = null,
        storyId: Long? = null,
        accessKey: String? = null,
        fields: Array<String>? = null
    ) : this() {
        this.ownerId = ownerId
        this.storyId = storyId
        this.accessKey = accessKey
        this.fields = fields
    }

    fun setOwnerId(ownerId: Long): StoriesGetRepliesMethod {
        this.ownerId = ownerId
        return this
    }

    fun setStoryId(storyId: Long): StoriesGetRepliesMethod {
        this.storyId = storyId
        return this
    }

    fun setAccessKey(accessKey: String): StoriesGetRepliesMethod {
        this.accessKey = accessKey
        return this
    }

    fun setFields(fields: Array<String>): StoriesGetRepliesMethod {
        this.fields = fields
        return this
    }

    override val classRef = StoriesGetRepliesMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<Array<Story>>>>() {}
    }
}
