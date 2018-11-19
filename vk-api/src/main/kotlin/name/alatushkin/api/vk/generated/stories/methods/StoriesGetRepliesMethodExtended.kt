package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.stories.GetRepliesExtendedResponse

/**
 *  Returns replies to the story.
 *
 *  [https://vk.com/dev/stories.getReplies]
 *  @property [owner_id] Story owner ID.
 *  @property [story_id] Story ID.
 *  @property [access_key] Access key for the private object.
 *  @property [fields] Additional fields to return
 */
class StoriesGetRepliesMethodExtended() : VkMethod<GetRepliesExtendedResponse>(
    "stories.getReplies",
    mutableMapOf("extended" to "1")
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

    fun setOwnerId(ownerId: Long): StoriesGetRepliesMethodExtended {
        this.ownerId = ownerId
        return this
    }

    fun setStoryId(storyId: Long): StoriesGetRepliesMethodExtended {
        this.storyId = storyId
        return this
    }

    fun setAccessKey(accessKey: String): StoriesGetRepliesMethodExtended {
        this.accessKey = accessKey
        return this
    }

    fun setFields(fields: Array<String>): StoriesGetRepliesMethodExtended {
        this.fields = fields
        return this
    }

    override val classRef = StoriesGetRepliesMethodExtended.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<GetRepliesExtendedResponse>>() {}
    }
}
