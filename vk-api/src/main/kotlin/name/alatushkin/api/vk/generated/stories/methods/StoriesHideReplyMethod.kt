@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/stories.hideReply]
 *
 * Hides the reply to the current user's story.
 *
 * @property ownerId ID of the user whose replies should be hidden.
 * @property storyId Story ID.
 * @property accessKey Access key for the private object.
 */
class StoriesHideReplyMethod(
        ownerId: Long,
        storyId: Long,
        accessKey: String? = null
) : VkMethod<Boolean>(
    "stories.hideReply",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserGroupMethod {

    var ownerId: Long by props
    var storyId: Long by props
    var accessKey: String? by props

    init {
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
}
