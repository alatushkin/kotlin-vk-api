@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stories.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.stories.GetExtendedResponse
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/stories.get]
 *
 * Returns stories available for current user.
 *
 * @property ownerId Owner ID.
 */
class StoriesGetMethodExtended(
    ownerId: Long? = null
) : VkMethod<GetExtendedResponse>(
    "stories.get",
    mutableMapOf("extended" to "1"),
    successReference()
), UserGroupMethod {

    var ownerId: Long? by props

    init {
        this.ownerId = ownerId
    }
}
