@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stories.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/stories.banOwner]
 *
 * Allows to hide stories from chosen sources from current user's feed.
 *
 * @property ownersIds List of sources IDs
 */
class StoriesBanOwnerMethod(
    ownersIds: Array<Long>
) : VkMethod<Boolean>(
    "stories.banOwner",
    mutableMapOf(),
    successReference()
), UserMethod {

    var ownersIds: Array<Long> by props

    init {
        this.ownersIds = ownersIds
    }
}
