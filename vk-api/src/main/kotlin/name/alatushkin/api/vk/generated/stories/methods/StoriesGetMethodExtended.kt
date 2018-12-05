@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.stories.GetExtendedResponse
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
    object : TypeReference<VkResponse<GetExtendedResponse>>() {}
), UserGroupMethod {

    var ownerId: Long? by props

    init {
        this.ownerId = ownerId
    }

    fun setOwnerId(ownerId: Long): StoriesGetMethodExtended {
        this.ownerId = ownerId
        return this
    }
}
