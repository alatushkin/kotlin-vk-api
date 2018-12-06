@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stories.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.stories.Story
import name.alatushkin.api.vk.successReference
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
class StoriesGetRepliesMethod(
    ownerId: Long,
    storyId: Long,
    accessKey: String? = null,
    fields: Array<String>? = null
) : VkMethod<VkList<Array<Story>>>(
    "stories.getReplies",
    mutableMapOf(),
    successReference()
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
}
