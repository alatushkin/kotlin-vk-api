@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.stories.GetRepliesExtendedResponse
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/stories.getReplies]
 *
 * Returns replies to the story.
 *
 * @property ownerId Story owner ID.
 * @property storyId Story ID.
 * @property accessKey Access key for the private object.
 * @property fields Additional fields to return
 */
class StoriesGetRepliesMethodExtended(
        ownerId: Long,
        storyId: Long,
        accessKey: String? = null,
        fields: Array<String>? = null
) : VkMethod<GetRepliesExtendedResponse>(
    "stories.getReplies",
    mutableMapOf("extended" to "1"),
    object : TypeReference<VkResponse<GetRepliesExtendedResponse>>() {}
), UserGroupMethod {

    var ownerId: Long by props
    var storyId: Long by props
    var accessKey: String? by props
    var fields: Array<String>? by props

    init {
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
}
