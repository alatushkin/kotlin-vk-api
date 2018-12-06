@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stories.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/stories.unbanOwner]
 *
 * Allows to show stories from hidden sources in current user's feed.
 *
 * @property ownersIds List of hidden sources to show stories from.
 */
class StoriesUnbanOwnerMethod(
    ownersIds: Array<Long>
) : VkMethod<Boolean>(
    "stories.unbanOwner",
    mutableMapOf(),
    successReference()
), UserMethod {

    var ownersIds: Array<Long> by props

    init {
        this.ownersIds = ownersIds
    }
}
