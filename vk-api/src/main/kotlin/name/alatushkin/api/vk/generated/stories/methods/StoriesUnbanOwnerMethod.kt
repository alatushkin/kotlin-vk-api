@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
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
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserMethod {

    var ownersIds: Array<Long> by props

    init {
        this.ownersIds = ownersIds
    }

    fun setOwnersIds(ownersIds: Array<Long>): StoriesUnbanOwnerMethod {
        this.ownersIds = ownersIds
        return this
    }
}
