@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stories.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/stories.hideAllReplies]
 *
 * Hides all replies in the last 24 hours from the user to current user's stories.
 *
 * @property ownerId ID of the user whose replies should be hidden.
 */
class StoriesHideAllRepliesMethod(
    ownerId: Long
) : VkMethod<Boolean>(
    "stories.hideAllReplies",
    mutableMapOf(),
    successReference()
), UserGroupMethod {

    var ownerId: Long by props

    init {
        this.ownerId = ownerId
    }
}
