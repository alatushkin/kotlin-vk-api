@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stories.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserGroupMethod {

    var ownerId: Long by props
    var storyId: Long by props
    var accessKey: String? by props

    init {
        this.ownerId = ownerId
        this.storyId = storyId
        this.accessKey = accessKey
    }
}
