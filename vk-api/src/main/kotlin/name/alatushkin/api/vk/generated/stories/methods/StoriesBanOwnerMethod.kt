@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
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
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var ownersIds: Array<Long> by props

    init {
        this.ownersIds = ownersIds
    }

    fun setOwnersIds(ownersIds: Array<Long>): StoriesBanOwnerMethod {
        this.ownersIds = ownersIds
        return this
    }
}
