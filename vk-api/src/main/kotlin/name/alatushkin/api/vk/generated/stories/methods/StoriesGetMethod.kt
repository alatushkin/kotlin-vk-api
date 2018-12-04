@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.stories.Story
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/stories.get]
 *
 * Returns stories available for current user.
 *
 * @property ownerId Owner ID.
 */
class StoriesGetMethod(
        ownerId: Long? = null
) : VkMethod<VkList<Array<Story>>>(
    "stories.get",
    mutableMapOf(),
    object : TypeReference<VkSuccess<VkList<Array<Story>>>>() {}
), UserGroupMethod {

    var ownerId: Long? by props

    init {
        this.ownerId = ownerId
    }

    fun setOwnerId(ownerId: Long): StoriesGetMethod {
        this.ownerId = ownerId
        return this
    }
}
